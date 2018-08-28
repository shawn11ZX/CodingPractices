package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTNodeTest {

    @Test
    public void test1() {
        BSTNode root = null;
        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
    }


    @Test
    public void test2() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 100);
        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
        node = BSTNode.find(root, 1);
        Assert.assertTrue(node.k == 1);
        Assert.assertTrue(node.v == 100);
    }

    @Test
    public void test3() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 2, 102);

        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
        for (int i = 1; i <= 6; i++)
        {
            node = BSTNode.find(root, i);
            Assert.assertTrue(node.k == i);
            Assert.assertTrue(node.v == (100+i));
        }

    }

}