package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q4.Q4_5.*;
public class Q4_5Test {

    @Test
    public void testIsSearchTree() {
        Result r = isSearchTree(null);
        Assert.assertTrue(r.b);
    }

    @Test
    public void testIsSearchTree1() {
        Result r = isSearchTree(new BinaryTreeNode(0, null, null));
        Assert.assertTrue(r.b);
    }

    @Test
    public void testIsSearchTree2() {
        Result r = isSearchTree(new BinaryTreeNode(0, new BinaryTreeNode(-1), new BinaryTreeNode(1)));
        Assert.assertTrue(r.b);
    }

    @Test
    public void testIsSearchTree3() {
        Result r = isSearchTree(new BinaryTreeNode(0, new BinaryTreeNode(1), new BinaryTreeNode(1)));
        Assert.assertTrue(!r.b);
    }
}