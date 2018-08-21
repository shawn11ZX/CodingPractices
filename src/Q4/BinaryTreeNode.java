package Q4;

public class BinaryTreeNode {
    public int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public int getHeight()
    {
        int leftHeight = (left != null) ? left.getHeight() : 0;
        int rightHeight = (right!= null) ? right.getHeight() : 0;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
