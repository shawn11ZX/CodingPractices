package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BSTNodeTest {

    @Test
    public void testInsert1() {
        BSTNode root = null;
        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
    }


    @Test
    public void testInsert2() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 100);
        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
        node = BSTNode.find(root, 1);
        Assert.assertTrue(node.k == 1);
        Assert.assertTrue(node.v == 100);
    }

    @Test
    public void testInsert3() {
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


    @Test
    public void testDelete1() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);

        BSTNode node = BSTNode.find(root, 0);
        Assert.assertTrue(node == null);
        for (int i = 1; i <= 6; i++)
        {
            node = BSTNode.find(root, i);
            Assert.assertTrue(node.k == i);
            Assert.assertTrue(node.v == (100+i));

            root = BSTNode.delete(root, i);
            node = BSTNode.find(root, i);
            Assert.assertTrue(node == null);
        }

    }

    @Test
    public void testNext() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);

        BSTNode node;
        BSTNode next;

        for (int i = 1; i <= 5; i++)
        {
            node = BSTNode.find(root, i);
            next = BSTNode.next(node);
            Assert.assertEquals(i, node.k);
            Assert.assertEquals(i+1, next.k);
        }
    }

}