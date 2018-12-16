def subsets(candidates, offset, prefix, action):
    if offset == len(candidates):
        action(prefix)
    else:
        prefix.append(candidates[offset])
        subsets(candidates, offset+1, prefix, action)
        prefix.pop()
        subsets(candidates, offset+1, prefix, action)


import unittest
class Test0(unittest.TestCase):
    def test0(self):
        subsets([1], 0, [], lambda i:print(i))
        subsets([1, 2], 0, [], lambda i: print(i))
        subsets([1, 2, 3], 0, [], lambda i: print(i))