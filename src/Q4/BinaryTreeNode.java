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

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode() {

    }

    public BinaryTreeNode(int value) {
        this.value = value;
    }

    public BinaryTreeNode(int value, BinaryTreeNode left) {
        this.value = value;
        this.left = left;
    }
}
