package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_8Test {
    @Test
    public void test1() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            BSTNode left = BSTNode.find(root, 5);
            BSTNode mid = BSTNode.find(root, 3);
            BSTNode right = BSTNode.find(root, 2);
            Assert.assertTrue(mid == Q4_8.commonAncestor(left, right));
        }
    }
    @Test

    public void test2() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            BSTNode left = BSTNode.find(root, 1);
            BSTNode mid = BSTNode.find(root, 1);
            BSTNode right = BSTNode.find(root, 1);
            Assert.assertTrue(mid == Q4_8.commonAncestor(left, right));
        }
    }

    public void test3() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            BSTNode left = BSTNode.find(root, 1);
            BSTNode mid = BSTNode.find(root, 1);
            BSTNode right = BSTNode.find(root, 3);
            Assert.assertTrue(mid == Q4_8.commonAncestor(left, right));
        }
    }

    @Test
    public void testfindCommonAncestorNoParent() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            Assert.assertTrue(3 == Q4_8.findCommonAncestorNoParent(root, 5, 2).k);
        }
    }

    @Test
    public void testfindCommonAncestorNoParent2() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            Assert.assertTrue(1 == Q4_8.findCommonAncestorNoParent(root, 1, 1).k);
        }
    }

    @Test
    public void testfindCommonAncestorNoParent3() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);
        {
            Assert.assertTrue(1 == Q4_8.findCommonAncestorNoParent(root, 1, 3).k);
        }
    }
}