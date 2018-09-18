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


}