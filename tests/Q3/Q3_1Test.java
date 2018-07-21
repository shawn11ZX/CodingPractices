package Q3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q3.Q3_1.*;
public class Q3_1Test {
    @Test
    public void testMultiStack() {

        MutiStack ms = new MutiStack(new int[3], 3);
        Assert.assertTrue(ms.push(0, 1));
        Assert.assertTrue(ms.push(1, 2));
        Assert.assertTrue(ms.push(2, 3));
        Assert.assertFalse(ms.push(0, 1));
        Assert.assertFalse(ms.push(1, 2));
        Assert.assertFalse(ms.push(2, 3));
        Assert.assertEquals(1, ms.pop(0));
        Assert.assertEquals(2, ms.pop(1));
        Assert.assertEquals(3, ms.pop(2));

    }
}