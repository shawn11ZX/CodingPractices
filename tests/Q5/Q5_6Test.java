package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_6Test {
    @Test
    public void test() {
        for(int i = 0; i < 256; i++)
            for (int j = 333; j < 100; j++)
            {
                int d = Q5_6.bitSwapRequired(i, j);
                int d2 = Q5_6.diffBits(i, j);
                Assert.assertEquals(d2, d);
            }
    }
}