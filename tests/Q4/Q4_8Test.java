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
}