package Q4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Q4_8 {
    public static BSTNode commonAncestor(BSTNode left, BSTNode right) {
        int leftHeight = getDepth(left);
        int rightHeight = getDepth(right);
        int diff = leftHeight - rightHeight;
        for (int i = 0; i < diff; i++)
        {
            left = left.parent;
        }
        for (int i = 0; i < -1* diff; i++)
        {
            right = right.parent;
        }
        while(left != null)
        {
            if(left == right) return left;
            left = left.parent;
            right = right.parent;
        }
        return null;
    }

    private static int getDepth(BSTNode right) {
        int depth = 0;
        while (right.parent != null) {
            right = right.parent;
            depth++;
        }
        return depth;
    }

    private static  boolean findPath(BSTNode root, int target, List<BSTNode> path)
    {
        boolean found = false;
        if (root == null)
            return  false;
        path.add(root);
        if(root.k == target)
            found = true;
        else if (root.left !=null && findPath(root.left, target, path))
        {
            found = true;
        }
        else if (root.right != null && findPath(root.right, target, path))
        {
            found = true;
        }
        if (!found)
            path.remove(path.size() - 1);
        return found;
    }

    public static BSTNode findCommonAncestorNoParent(BSTNode root, int left, int right) {
        List<BSTNode> leftPath = new ArrayList<>();
        List<BSTNode> rightPath = new ArrayList<>();
        boolean leftFound = findPath(root, left, leftPath);
        boolean rightFound = findPath(root, right, rightPath);
        if (leftFound && rightFound)
        {
            BSTNode rc = null;
            for(Iterator leftItr = leftPath.iterator(), rightItr = rightPath.iterator();
                    leftItr.hasNext() && rightItr.hasNext(); )
            {
                BSTNode lnode = (BSTNode )leftItr.next();
                BSTNode rnode = (BSTNode )rightItr.next();
                if (lnode != rnode)
                    break;
                else
                    rc = lnode;
            }
            return rc;
        }
        return null;
    }

}
