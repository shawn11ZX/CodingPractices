package Q4;

public class Q4_2 {
    public static BinaryTreeNode build(int[] array, int start, int end)
    {
        if (end <= start)
            return null;
        else {
            int mid = (start + end)  / 2;
            BinaryTreeNode root = new BinaryTreeNode();
            root.value = array[mid];
            root.left = build(array, start, mid);
            root.right = build(array, mid + 1, end);
            return root;
        }
    }

}
