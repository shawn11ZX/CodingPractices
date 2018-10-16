package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_7Test {
    @Test
    public void test()
    {
        for (int i = 0; i < 10000; i+=7)
        {
            int n1 = Q5_7.swapEvenOddBits(i);
            int n2 = Q5_7.swapEvenOddBits2(i);
            Assert.assertEquals("comparing " + i, n1, n2);
        }
    }
}