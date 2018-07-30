package Q3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q3.Q3_3.*;
public class Q3_3Test {
    @Test
    public void testSetsOfStack() {
            SetsOfStack ss = new SetsOfStack(1, 1);
            Assert.assertEquals(true, ss.push(1));
            Assert.assertEquals(false, ss.push(1));
            Assert.assertEquals(1, ss.pop());
    }
    @Test(expected = IllegalStateException.class)
    public void testSetsOfStack2() {
        SetsOfStack ss = new SetsOfStack(1, 1);
        Assert.assertEquals(true, ss.push(1));
        Assert.assertEquals(false, ss.push(1));
        Assert.assertEquals(1, ss.pop());
        ss.pop();
    }

    @Test
    public void testSetsOfStack3() {
        SetsOfStack ss = new SetsOfStack(5, 10);
        for(int i = 0; i < 50; i++)
        {
            Assert.assertEquals(true, ss.push(i));
        }
        Assert.assertEquals(false, ss.push(51));

        for(int i = 49; i >= 0; i--)
        {
            Assert.assertEquals(i, ss.pop());
        }
    }

    @Test(expected = IllegalStateException.class)
    public void testSetsOfStack4() {
        SetsOfStack ss = new SetsOfStack(5, 10);
        for(int i = 0; i < 50; i++)
        {
            Assert.assertEquals(true, ss.push(i));
        }
        Assert.assertEquals(false, ss.push(51));

        for(int i = 49; i >= 0; i--)
        {
            Assert.assertEquals(i, ss.pop());
        }
        ss.pop();
    }

    @Test
    public void testSetsOfStack5() {
        SetsOfStack ss = new SetsOfStack(5, 10);
        for(int i = 0; i < 50; i++)
        {
            Assert.assertEquals(true, ss.push(i));
        }
        Assert.assertEquals(4, ss.popAt(0));

        for(int i = 49; i >= 5; i--)
        {
            Assert.assertEquals(i, ss.pop());
        }
        for(int i = 3; i >= 0; i--)
        {
            Assert.assertEquals(i, ss.pop());
        }
    }
}