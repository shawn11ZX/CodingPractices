package Q4;

public class TreeNode {
    public String name;
    public TreeNode[] children;

    public TreeNode(String name, TreeNode ... nodes) {
        this.name = name;
        children = nodes;
    }

    public void setChildren(TreeNode ... nodes)
    {
        children = nodes;
    }
}
