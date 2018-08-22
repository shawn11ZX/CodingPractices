package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q4.Q4_4.*;
public class Q4_4Test {

    @Test
    public void testIsBalanced() {
        Result rc = isBalanced(null);
        Assert.assertTrue(rc.b);
    }

    @Test
    public void testIsBalanced2() {
        Result rc = isBalanced(new BinaryTreeNode());
        Assert.assertTrue(rc.b);
    }

    @Test
    public void testIsBalanced3() {
        Result rc = isBalanced(new BinaryTreeNode(1,
                new BinaryTreeNode(2,
                        new BinaryTreeNode(),
                        null),
                null));
        Assert.assertFalse(rc.b);
    }
}