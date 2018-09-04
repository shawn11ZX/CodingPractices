package Q4;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Q4_9Test {

    @Test
    public void testAllSequences() {
        BSTNode root = null;
        root = BSTNode.insert(root, 2, 101);
        root = BSTNode.insert(root, 1, 103);
        root = BSTNode.insert(root, 3, 104);
        ArrayList<ArrayList<Integer>> rc = Q4_9.allSequences(root);
        Assert.assertTrue(rc.size() == 2);
    }
}