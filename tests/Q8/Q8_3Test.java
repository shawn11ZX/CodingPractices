package Q8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_3Test {
    @Test
    public void test() {
        Assert.assertEquals(0, Q8_3.magicNumber(new int[] { 0}));
        Assert.assertEquals(0, Q8_3.magicNumber(new int[] {0, 2, 3}));
        Assert.assertEquals(-1, Q8_3.magicNumber(new int[] {1, 2, 3}));
        Assert.assertEquals(1, Q8_3.magicNumber(new int[] {-1, 1, 3}));
        Assert.assertEquals(7, Q8_3.magicNumber(new int[] {-1, 0, 1, 2, 3, 4, 5, 7, 9}));
    }
}