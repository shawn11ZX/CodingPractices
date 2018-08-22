package Q4;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return Objects.equals(name, treeNode.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }
}
