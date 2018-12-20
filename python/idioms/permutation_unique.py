def permutation_unique(candidates, offset, prefix, action):
    if offset == len(candidates):
        action(prefix)
    else:
        for i in range(0, offset+1):
            prefix.insert(i, candidates[offset])
            permutation_unique(candidates, offset + 1, prefix, action)
            prefix.pop(i)


import unittest
class Test0(unittest.TestCase):
    def test0(self):
        permutation_unique([1], 0, [], lambda i:print(i))
        permutation_unique([1, 2], 0, [], lambda i:print(i))
        permutation_unique([1, 2, 3], 0, [], lambda i:print(i))
