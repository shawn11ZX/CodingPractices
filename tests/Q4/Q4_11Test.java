package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_11Test {
    @Test
    public void testRandom() {
        BSTNode root = null;
        root = BSTNode.insert(root, 1, 101);
        root = BSTNode.insert(root, 3, 103);
        root = BSTNode.insert(root, 4, 104);
        root = BSTNode.insert(root, 5, 105);
        root = BSTNode.insert(root, 2, 102);
        root = BSTNode.insert(root, 6, 106);
        root = BSTNode.insert(root, 7, 106);

        Assert.assertTrue(Q4_11.random(root) != null);
    }
}