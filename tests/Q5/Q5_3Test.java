package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_3Test {
    @Test
    public void test() {
        for (int i = 0; i < 111111111; i++)
        {
            int r1 = Q5_3.flipBit(i);
            int r2 = Q5_3.flipBit2(i);
            Assert.assertEquals("comparing " + i, r1, r2);
        }
    }
}