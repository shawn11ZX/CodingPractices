import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_5Test {

    @Test
    public void isOneWay() {
        Assert.assertFalse(Q1_5.isOneWay("", ""));
        Assert.assertTrue(Q1_5.isOneWay("a", ""));
        Assert.assertTrue(Q1_5.isOneWay("", "a"));
        Assert.assertTrue(Q1_5.isOneWay("b", "a"));
        Assert.assertFalse(Q1_5.isOneWay("bc", "ab"));
        Assert.assertTrue(Q1_5.isOneWay("az", "a"));
        Assert.assertTrue(Q1_5.isOneWay("a", "aa"));
        Assert.assertTrue(Q1_5.isOneWay("bcc", "bac"));
        Assert.assertFalse(Q1_5.isOneWay("bcb", "abc"));
    }
}