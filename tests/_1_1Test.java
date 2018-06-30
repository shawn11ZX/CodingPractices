import org.junit.Assert;

import static org.junit.Assert.*;

public class _1_1Test {

    @org.junit.Test
    public void isUnique() {
        Assert.assertTrue(_1_1.isUnique(""));
        Assert.assertTrue(_1_1.isUnique("a"));
        Assert.assertTrue(_1_1.isUnique("abc"));
        Assert.assertFalse(_1_1.isUnique("aa"));
        Assert.assertFalse(_1_1.isUnique("aaabc"));
    }

    @org.junit.Test
    public void isUnique2() {
        Assert.assertTrue(_1_1.isUnique2(""));
        Assert.assertTrue(_1_1.isUnique2("a"));
        Assert.assertTrue(_1_1.isUnique2("abc"));
        Assert.assertFalse(_1_1.isUnique2("aa"));
        Assert.assertFalse(_1_1.isUnique2("aaabc"));
    }

    @org.junit.Test
    public void isUnique3() {
        Assert.assertTrue(_1_1.isUnique3(""));
        Assert.assertTrue(_1_1.isUnique3("a"));
        Assert.assertTrue(_1_1.isUnique3("abc"));
        Assert.assertFalse(_1_1.isUnique3("aa"));
        Assert.assertFalse(_1_1.isUnique3("aaabc"));
    }
}