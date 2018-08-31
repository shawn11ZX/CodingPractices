## List iteration
    forget to set cur = cur.next in loops
## 4.6 Successor in Binary Search Tree
    - If N has right, it's successor is **NOT** the root of right, but the most left element of it's right
    - If N has no right, it's successor is the nearest parent/grandparent who's left sub tree contains N.
## 4.7 Dependency Graph
    - Don't forget to mark & clean states: building & built
    - Don't forget to check return code of sub build
## 4.8 Tree:
    - Definition of height & depth
        - Height of node: The height of a node is the number of edges on the longest path between that node and a leaf.
        - Height of tree:  The height of a tree is the height of its root node.
        - Depth: The depth of a node is the number of edges from the tree's root node to the node. Depth of root is zero
    - Common Ancestor
        - In BST, it is NOT true that common ancestor of node 3 and 5 is 4