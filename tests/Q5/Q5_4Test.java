package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_4Test {

    @Test
    public void nextLarger() {
        for (int i = 1; i < 11111; i++) {
            int r1 = Q5_4.next(i);
            int r2 = Q5_4.next2(i);
            Assert.assertEquals("comparing " + i, r2, r1);
        }
    }
}