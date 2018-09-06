package Q4;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q4_10Test {

    @Test
    public void testIsSubTree() {
        BSTNode large = null;
        BSTNode small = null;
        Assert.assertTrue(Q4_10.isSubTree(large, small));
    }

    @Test
    public void testIsSubTree2() {
        BSTNode large = null;
        BSTNode small = new BSTNode(1, null, null);
        Assert.assertFalse(Q4_10.isSubTree(large, small));
    }

    @Test
    public void testIsSubTree3() {
        BSTNode large = new BSTNode(1, null, null);
        BSTNode small = null;
        Assert.assertFalse(Q4_10.isSubTree(large, small));
    }

    @Test
    public void testIsSubTree4() {
        BSTNode large = new BSTNode(1, null, null);
        BSTNode small = new BSTNode(1, null, null);
        Assert.assertTrue(Q4_10.isSubTree(large, small));
    }

    @Test
    public void testIsSubTree5() {
        BSTNode large = new BSTNode(1,
                new BSTNode(2,
                        new BSTNode(3,
                                new BSTNode(4,
                                        null,
                                        null),
                                null),
                        null
                ),
                null);
        BSTNode small = new BSTNode(1, null, null);
        Assert.assertFalse(Q4_10.isSubTree(large, small));
    }

    @Test
    public void testIsSubTree6() {
        BSTNode large = new BSTNode(1,
                new BSTNode(2,
                        new BSTNode(3,
                                new BSTNode(4,
                                        null,
                                        null),
                                null),
                        null
                ),
                null);
        BSTNode small = new BSTNode(3,
                new BSTNode(4,
                        null,
                        null),
                null);
        Assert.assertTrue(Q4_10.isSubTree(large, small));
    }
}