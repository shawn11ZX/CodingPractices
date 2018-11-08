package Q8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_5Test {
    @Test
    public void test() {
        for (int i = 0; i < 100; i++)
        {
            Assert.assertEquals(String.format("test {}*{}={}", i, i, i*i), Q8_5.multi(i, i) , Q8_5.multiRecu(i, i));
        }
    }
}