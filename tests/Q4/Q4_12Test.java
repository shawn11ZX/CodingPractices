package Q4;

import org.junit.Assert;
import org.junit.Test;

import static Q4.Q4_12.*;
public class Q4_12Test {

    @Test
    public void pathsWithSumTest() {
        BinaryTreeNode root = null;
        int targetSum = 0;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertTrue(fastCount == 0);
        Assert.assertTrue(slowCount == 0);
    }

    @Test
    public void pathsWithSumTest2() {
        BinaryTreeNode root = new BinaryTreeNode(100);
        int targetSum = 0;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertTrue(fastCount == 0);
        Assert.assertTrue(slowCount == 0);
    }

    @Test
    public void pathsWithSumTest3() {
        BinaryTreeNode root = new BinaryTreeNode(100);
        int targetSum = 100;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertTrue(fastCount == 1);
        Assert.assertTrue(slowCount == 1);
    }

    @Test
    public void pathsWithSumTest4() {
        BinaryTreeNode root = new BinaryTreeNode(100, new BinaryTreeNode(10), new BinaryTreeNode(9));
        int targetSum = 9;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertTrue(fastCount == 1);
        Assert.assertTrue(slowCount == 1);
    }

    @Test
    public void pathsWithSumTest5() {
        BinaryTreeNode root = new BinaryTreeNode(10, new BinaryTreeNode(10), new BinaryTreeNode(9));
        int targetSum = 10;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertTrue(fastCount == 2);
        Assert.assertTrue(slowCount == 2);
    }

    @Test
    public void pathsWithSumTest6() {
        BinaryTreeNode root = new BinaryTreeNode(10,
                new BinaryTreeNode(5,
                        new BinaryTreeNode(3,
                                new BinaryTreeNode(3),
                                new BinaryTreeNode(-2)),
                        new BinaryTreeNode(2,
                                null,
                                new BinaryTreeNode(1))),
                new BinaryTreeNode(-3,
                        null,
                        new BinaryTreeNode(11)));
        int targetSum = 8;
        int fastCount = pathsWithSumFast(root, targetSum);
        int slowCount = pathsWithSumSlow(root, targetSum, 0);
        Assert.assertEquals(3, fastCount);
        Assert.assertEquals(3, slowCount );
    }


}