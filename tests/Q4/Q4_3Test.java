package Q4;

import org.junit.Assert;
import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.List;

import static Q4.Q4_3.*;
public class Q4_3Test {

    @Test
    public void testGetListOfDepth() {
        TreeNode root = null;
        List<List<TreeNode>> rc = getListOfDepth(root);
        Assert.assertTrue(rc.size() == 0);
    }

    @Test
    public void testGetListOfDepth2() {
        TreeNode root = new TreeNode("a");
        List<List<TreeNode>> rc = getListOfDepth(root);
        Assert.assertTrue(rc.size() == 1);
        Assert.assertArrayEquals(new Object[] {root}, rc.get(0).toArray());
    }

    @Test
    public void testGetListOfDepth3() {

        TreeNode root = new TreeNode("1",
                new TreeNode("11",
                        new TreeNode("111",
                                new TreeNode("1111"),
                                new TreeNode("1112")),
                        new TreeNode("112",
                                new TreeNode("1121"),
                                new TreeNode("1122"))
                ),
                new TreeNode("12",
                        new TreeNode("121",
                                new TreeNode("1211"),
                                new TreeNode("1212")),
                        new TreeNode("122",
                                new TreeNode("1221"),
                                new TreeNode("1222")))
        );
        List<List<TreeNode>> rc = getListOfDepth(root);
        Assert.assertEquals(4, rc.size());
        Assert.assertArrayEquals(new Object[] {new TreeNode("1")}, rc.get(0).toArray());
        Assert.assertArrayEquals(new Object[] {new TreeNode("11"), new TreeNode("12")}, rc.get(1).toArray());
        Assert.assertArrayEquals(new Object[] {new TreeNode("111"), new TreeNode("112"), new TreeNode("121"), new TreeNode("122")}, rc.get(2).toArray());
        Assert.assertArrayEquals(new Object[] {new TreeNode("1111"), new TreeNode("1112"), new TreeNode("1121"), new TreeNode("1122"), new TreeNode("1211"), new TreeNode("1212"), new TreeNode("1221"), new TreeNode("1222")}, rc.get(3).toArray());
    }
}