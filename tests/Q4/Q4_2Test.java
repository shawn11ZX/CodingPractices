package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q4.Q4_2.*;
public class Q4_2Test {

    @Test
    public void testBuild() {
        int[] array = new int[] {};
        BinaryTreeNode root = build(array, 0, array.length);
        Assert.assertNull(root);
    }

    @Test
    public void testBuild0() {
        int[] array = new int[] {0};
        BinaryTreeNode root = build(array, 0, array.length);
        Assert.assertEquals(1, root.getHeight());
    }

    @Test
    public void testBuild2() {
        int[] array = new int[] {0, 1, 2};
        BinaryTreeNode root = build(array, 0, array.length);
        Assert.assertEquals(2, root.getHeight());
    }


    @Test
    public void testBuild3() {
        int maxLevel = 10;
        for (int level = 1; level <= maxLevel; level++)
        {
            int maxSize = (int)Math.pow(2, level) - 1;
            int[] array = new int[maxSize];
            BinaryTreeNode root = build(array, 0, array.length);
            Assert.assertEquals(level, root.getHeight());
        }
    }
}