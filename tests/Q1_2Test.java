import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_2Test {

    @Test
    public void isSamePermutation() {
        Assert.assertTrue(Q1_2.isSamePermutation("", ""));
        Assert.assertTrue(Q1_2.isSamePermutation("a", "a"));
        Assert.assertTrue(Q1_2.isSamePermutation("abb", "abb"));
        Assert.assertFalse(Q1_2.isSamePermutation("a", ""));
        Assert.assertFalse(Q1_2.isSamePermutation("", "a"));
        Assert.assertFalse(Q1_2.isSamePermutation("ab", "a"));
        Assert.assertFalse(Q1_2.isSamePermutation("ab", "aa"));
    }

    @Test
    public void isSamePermutation2() {
        Assert.assertTrue(Q1_2.isSamePermutation2("", ""));
        Assert.assertTrue(Q1_2.isSamePermutation2("a", "a"));
        Assert.assertTrue(Q1_2.isSamePermutation2("abb", "abb"));
        Assert.assertFalse(Q1_2.isSamePermutation2("a", ""));
        Assert.assertFalse(Q1_2.isSamePermutation2("", "a"));
        Assert.assertFalse(Q1_2.isSamePermutation2("ab", "a"));
        Assert.assertFalse(Q1_2.isSamePermutation2("ab", "aa"));
    }
}