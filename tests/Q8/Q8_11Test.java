package Q8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_11Test {

    @Test
    public void makeChange2() {
        for(int i = 0; i < 100; i++)
        {
            int exp = Q8_11.makeChange(i);
            int real = Q8_11.makeChange2(i);

            Assert.assertEquals("index " + i, exp, real);
        }
        System.out.println("hit " + Q8_11.hitCount);
    }

    @Test
    public void makeChange() {
    }
}