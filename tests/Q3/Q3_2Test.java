package Q3;

import org.junit.Assert;
import org.junit.Test;

import static Q3.Q3_2.*;

public class Q3_2Test {
    @Test
    public void testMultiStack() {
        MinStack ms = new MinStack(10);
        ms.push(5);
        ms.push(3);
        ms.push(1);
        ms.push(4);
        ms.push(6);

        Assert.assertEquals(1, ms.min());

        ms.pop();
        Assert.assertEquals(1, ms.min());

        ms.pop();
        Assert.assertEquals(1, ms.min());

        ms.pop();
        Assert.assertEquals(3, ms.min());

        ms.pop();
        Assert.assertEquals(5, ms.min());

        ms.pop();
    }
}