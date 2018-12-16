def swap(l, i1, i2):
    t = l[i1]
    l[i1] = l[i2]
    l[i2] = t


# use l[s] is a pivot
# after partial sort, the following conditions are met:
# - for all i in [s+1, ss), l[i] < l[s]
# - for all i in [ss, e), l[i] >= l[s]
def partial_sort(l, s, e):
    ss = s + 1
    ee = e - 1
    while ss <= ee:
        while ss <= ee and l[ss] < l[s]:
            ss += 1
        while ss <= ee and l[ee] >= l[s]:
            ee -= 1
        if ss < ee:
            swap(l, ss, ee)
    return ss


def qsort(l, s, e):
    if s >= e-1:
        return
    mid = (s+e)//2
    swap(l, s, mid)
    ss = partial_sort(l, s, e)
    swap(l, ss-1, s)
    qsort(l, s, ss-1)
    qsort(l, ss, e)
    return l


from . permutation_unique import permutation_unique
import unittest
class Test0(unittest.TestCase):
    def test0(self):
        array = [1,2,3]
        permutation_unique(array, 0, [], lambda l:self.assertListEqual(sorted(array), qsort(array, 0, len(array))))
