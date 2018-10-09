package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_4Test {

    @Test
    public void nextLarger() {
        {
            int r1 = Q5_4.next(0);
            int r2 = Q5_4.next2(0);
            Assert.assertEquals("comparing " + 0, r2, r1);
        }
        {
            int r1 = Q5_4.next(0xffff0000);
            int r2 = Q5_4.next2(0xffff0000);
            Assert.assertEquals("comparing " + 0xffff0000, r2, r1);
        }
        {
            int r1 = Q5_4.next(0xffffffff);
            int r2 = Q5_4.next2(0xffffffff);
            Assert.assertEquals("comparing " + 0xffffffff, r2, r1);
        }
        for (int i = 1; i < 11111; i++) {
            int r1 = Q5_4.next(i);
            int r2 = Q5_4.next2(i);
            Assert.assertEquals("comparing " + i, r2, r1);
        }
    }
}