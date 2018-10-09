
## List iteration
    forget to set cur = cur.next in loops
## 4.6 Successor in Binary Search Tree
- If N has right, it's successor is *NOT* the root of right, but the most left element of it's right
- If N has no right, it's successor is the nearest parent/grandparent who's left sub tree contains N.
## 4.7 Dependency Graph
- Don't forget to mark & clean states: building & built
- Don't forget to check return code of sub build
## 4.8 Tree:
- Definition of height & depth
	* Height of node: The height of a node is the number of edges on the longest path between that node and a leaf.
	* Height of tree:  The height of a tree is the height of its root node.
	* Depth: The depth of a node is the number of edges from the tree's root node to the node. Depth of root is zero
- Common Ancestor
        - In BST, it is NOT true that common ancestor of node 3 and 5 is 4
        
## 4.9 BST Sequences
- To simplify push/pop use Stack<T>, which can be an argument to ArrayList<T> 
- The constructor of ArrayList<Integer> is ambigous.
    
## 4.10 subtree
- empty tree is subtree of any tree including itself
    
## 4.11 tree random node
- Random.nextInt maybe negative, use nextInt(bound) instead of nextInt() % bound
    
## 4.12 sum of tree path
- to compute time complexity for a tree related algorithm, conside balanced and non-balance (such as a list) seperately
- when getting the HashMap<sum, count> from a node, we should return two map, one includes current node, the other does not 
    
## 5.4 next larger / next smaller with same 1 bits
- **when calculating count in loop, distinguish between 'count' and 'offset'**
- start with easy solution, then optimized.
- precedence of shift is smaller than minus, ```i<<1 - 1``` is diff from ```(i<<1) - 1```
- precedence of bitwise operator is smaller than minus, so ```i&1 - 1``` is diff from ```(i&1) - 1```