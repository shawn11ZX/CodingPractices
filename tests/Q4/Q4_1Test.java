package Q4;

import Q3.Q3_3;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import Q4.TreeNode;

import java.util.Stack;

import static Q4.Q4_1.*;
public class Q4_1Test {
    @Test
    public void testQ1() {
        TreeNode n1 = new TreeNode("n1");

        Stack<TreeNode> realRoute = new Stack<>();
        boolean found = findRoute(realRoute, n1, n1);

        Stack<TreeNode> expectRoute = new Stack<>();
        expectRoute.push(n1);
        Assert.assertArrayEquals(realRoute.toArray(), expectRoute.toArray());
        Assert.assertTrue(found);
    }

    @Test
    public void testQ1_1() {
        TreeNode n1 = new TreeNode("n1");
        TreeNode n2 = new TreeNode("n2");

        Stack<TreeNode> realRoute = new Stack<>();
        boolean found = findRoute(realRoute, n1, n2);

        Stack<TreeNode> expectRoute = new Stack<>();

        Assert.assertArrayEquals(realRoute.toArray(), expectRoute.toArray());
        Assert.assertFalse(found);
    }

    @Test
    public void testQ1_loop() {
        TreeNode n2 = new TreeNode("n2");
        TreeNode n1 = new TreeNode("n1", n2);

        Stack<TreeNode> realRoute = new Stack<>();
        boolean found = findRoute(realRoute, n1, n2);

        Stack<TreeNode> expectRoute = new Stack<>();
        expectRoute.push(n1);
        expectRoute.push(n2);
        Assert.assertArrayEquals(realRoute.toArray(), expectRoute.toArray());
        Assert.assertTrue(found);
    }
}