package Q1;

import Q1.Q1_6;
import org.junit.Assert;
import org.junit.Test;

public class Q1_6Test {

    @Test
    public void compress() {
        Assert.assertEquals(Q1_6.compress(""), "");
        Assert.assertEquals(Q1_6.compress("a"), "a");
        Assert.assertEquals(Q1_6.compress("aa"), "aa");
        Assert.assertEquals(Q1_6.compress("aaa"), "a3");
        Assert.assertEquals(Q1_6.compress("aaab"), "aaab");
        Assert.assertEquals(Q1_6.compress("aaaab"), "a4b1");

    }
}