#957. Prison Cells After N Days

from . BitSet import BitSet


def to_list(self):
    return [1 if self.get(b) else 0 for b in range(8)]


def next(self):
    bs = BitSet()
    for i in range(1, 7):
        b1 = self.get(i-1)
        b2 = self.get(i + 1)
        if b1 == b2:
            bs.set(i)
    return bs

class Solution:
    def prisonAfterNDays(self, cells, N):
        """
        :type cells: List[int]
        :type N: int
        :rtype: List[int]
        """
        bs = BitSet()
        bs.init(cells)
        step = 0
        history = {}

        while N > 0:
            # at each step
            # - N is remaining steps to go
            # - bs is current value
            # - step is current step
            # without loop, step + N = N
            v = bs.get_value()
            if v in history:
                span = step - history[v]
                # image standing on step history[v] with the knowledge of future loop
                N = N % span
                # since previous step will break N > 0 requirement
                if N == 0:
                    break

            history[v] = step
            bs = next(bs)
            N = N - 1
            step = step + 1

        return to_list(bs)

import unittest
class TestS(unittest.TestCase):
    def test_0(self):
        s = Solution()
        self.assertListEqual([0, 0, 1, 1, 1, 1, 1, 0], s.prisonAfterNDays([1, 0, 0, 1, 0, 0, 1, 0], 1000000000))
        self.assertListEqual([0, 0, 1, 0, 1, 0, 0, 0], s.prisonAfterNDays([1, 0, 0, 0, 1, 0, 0, 1], 99))
        self.assertListEqual([0, 0, 1, 1, 0, 0, 0, 0], s.prisonAfterNDays([0, 1, 0, 1, 1, 0, 0, 1], 7))
