package Q4;

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
}
