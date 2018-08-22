package Q4;

public class Q4_5 {
    public static class Result {
        public boolean b;
        public int min;
        public int max;

        public Result(boolean b, int min, int max) {
            this.b = b;
            this.min = min;
            this.max = max;
        }
    }
    public static Result isSearchTree(BinaryTreeNode root)
    {
        if (root == null)
            return new Result(true, 0, 0);
        else {
            if (root.left != null && root.right != null)
            {
                Result left = isSearchTree(root.left);
                if (!left.b)
                {
                    return new Result(false, left.min, root.value);
                }
                Result right = isSearchTree(root.right);
                boolean b = left.b && right.b && (left.max <= root.value) && root.value < right.min;
                return new Result(b, left.min, right.max);
            }
            else if (root.left != null)
            {
                Result left = isSearchTree(root.left);
                boolean b = left.b && (left.max <= root.value);
                return new Result(b, left.min, root.value);
            }
            else if (root.right != null)
            {
                Result right = isSearchTree(root.right);
                boolean b = right.b && root.value < right.min;
                return new Result(b, root.value, right.max);
            }
            else {
                return new Result(true, root.value, root.value);
            }
        }
    }
}
