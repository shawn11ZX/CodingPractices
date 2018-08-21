package Q4;

public class Q4_4 {
    public static class Result {
        public boolean b;
        public int depth;

        public Result(boolean b, int depth) {
            this.b = b;
            this.depth = depth;
        }
    }
    public static Result isBalanced(BinaryTreeNode root)
    {
        if (root == null)
            return new Result(true, 0);
        Result l = isBalanced(root.left);
        Result r = isBalanced(root.right);
        int d = Math.max(l.depth, r.depth) + 1;
        if (!l.b || !r.b)
            return new Result(false, d);
        int diff = l.depth - r.depth;
        if (diff > -1 && diff < 1)
            return new Result(true, d);
        else
            return new Result(false, d);
    }
}
