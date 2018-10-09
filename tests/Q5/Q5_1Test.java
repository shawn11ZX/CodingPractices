package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_1Test {

    @Test
    public void bitInsertion() {
        {
            int n = 10;
            int m = 3;
            int i = 2;
            int j = 3;
            int r1 = Q5_1.bitInsertion(n, m, i, j);
            int r2 = Q5_1.bitInsertion2(n, m, i, j);
            Assert.assertEquals(r1, r2);
        }
    }

    @Test
    public void bitInsertion2() {
        {
            int n = 32342;
            int m = 34;
            int i = 2;
            int j = 6;
            int r1 = Q5_1.bitInsertion(n, m, i, j);
            int r2 = Q5_1.bitInsertion2(n, m, i, j);
            Assert.assertEquals(r1, r2);
        }
    }

    @Test
    public void bitInsertion3() {
        {
            int n = 0xFFF1;
            int m = 0x34;
            int i = 2;
            int j = 6;
            int r1 = Q5_1.bitInsertion(n, m, i, j);
            int r2 = Q5_1.bitInsertion2(n, m, i, j);
            Assert.assertEquals(r1, r2);
        }
    }

}