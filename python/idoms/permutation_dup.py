import collections


def permutation_duplicate(candidates, action):
    candidates_counter = collections.Counter(candidates)
    permutation_duplicate_1(candidates_counter, [], action)


def permutation_duplicate_1(candidates_counter, prefix, action):
    empty = True
    for k, c in candidates_counter.items():
        if c > 0:
            candidates_counter[k] = c - 1
            prefix.append(k)
            permutation_duplicate_1(candidates_counter, prefix, action)
            prefix.pop()
            candidates_counter[k] = c
            empty = False
    if empty:
        action(prefix)


import unittest
class Test0(unittest.TestCase):
    def test0(self):
        permutation_duplicate([1, 1, 2, 3], lambda i:print(i))
