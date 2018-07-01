import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_4Test {

    @Test
    public void isPalindromePermutation() {
        Assert.assertTrue(Q1_4.isPalindromePermutation(""));
        Assert.assertTrue(Q1_4.isPalindromePermutation("a"));
        Assert.assertTrue(Q1_4.isPalindromePermutation("zz"));
        Assert.assertTrue(Q1_4.isPalindromePermutation("aza"));
        Assert.assertTrue(Q1_4.isPalindromePermutation("abba"));
        Assert.assertFalse(Q1_4.isPalindromePermutation("abc"));
    }

    @Test
    public void isPalindromePermutation2() {
        Assert.assertTrue(Q1_4.isPalindromePermutation2(""));
        Assert.assertTrue(Q1_4.isPalindromePermutation2("a"));
        Assert.assertTrue(Q1_4.isPalindromePermutation2("zz"));
        Assert.assertTrue(Q1_4.isPalindromePermutation2("aza"));
        Assert.assertTrue(Q1_4.isPalindromePermutation2("abba"));
        Assert.assertFalse(Q1_4.isPalindromePermutation2("abc"));
    }
}