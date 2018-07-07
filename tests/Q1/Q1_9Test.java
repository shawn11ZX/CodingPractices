package Q1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_9Test {

    @Test
    public void isStringRotate() {
        Assert.assertTrue(Q1_9.isStringRotate("", ""));
        Assert.assertTrue(Q1_9.isStringRotate("a", "a"));
        Assert.assertTrue(Q1_9.isStringRotate("abc", "bca"));
        Assert.assertTrue(Q1_9.isStringRotate("abc", "abc"));
        Assert.assertFalse(Q1_9.isStringRotate("abc", "bac"));
        Assert.assertFalse(Q1_9.isStringRotate("abc", "ab"));

    }
}