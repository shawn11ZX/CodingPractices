package Q8;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q8_1Test {

    @Test
    public void testCountWays() {
        for (int i = 1; i < 10;i++)
        {

            Assert.assertEquals("index " + i, Q8.Q8_1.countWays(i), Q8.Q8_1.countWays2(i));
        }
    }
}