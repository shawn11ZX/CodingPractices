package Q1;

import Q1.Q1_1;
import org.junit.Assert;

public class Q1_1Test {

    @org.junit.Test
    public void isUnique() {
        Assert.assertTrue(Q1_1.isUnique(""));
        Assert.assertTrue(Q1_1.isUnique("a"));
        Assert.assertTrue(Q1_1.isUnique("abc"));
        Assert.assertFalse(Q1_1.isUnique("aa"));
        Assert.assertFalse(Q1_1.isUnique("aaabc"));
    }

    @org.junit.Test
    public void isUnique2() {
        Assert.assertTrue(Q1_1.isUnique2(""));
        Assert.assertTrue(Q1_1.isUnique2("a"));
        Assert.assertTrue(Q1_1.isUnique2("abc"));
        Assert.assertFalse(Q1_1.isUnique2("aa"));
        Assert.assertFalse(Q1_1.isUnique2("aaabc"));
    }

    @org.junit.Test
    public void isUnique3() {
        Assert.assertTrue(Q1_1.isUnique3(""));
        Assert.assertTrue(Q1_1.isUnique3("a"));
        Assert.assertTrue(Q1_1.isUnique3("abc"));
        Assert.assertFalse(Q1_1.isUnique3("aa"));
        Assert.assertFalse(Q1_1.isUnique3("aaabc"));
    }
}