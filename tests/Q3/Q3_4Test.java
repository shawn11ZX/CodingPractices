package Q3;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q3.Q3_4.*;
public class Q3_4Test {
    @Test
    public void testQueueViaStack() {
        QueueViaStack<Integer> q = new QueueViaStack<Integer>();
        q.enqueue(1);
        Assert.assertEquals(1, (int)q.dequeue());
    }

    @Test
    public void testQueueViaStack2() {
        QueueViaStack<Integer> q = new QueueViaStack<Integer>();
        for(int i = 0; i < 10; i++)
            q.enqueue(i);
        for(int i = 0; i < 5; i++)
            Assert.assertEquals(i, (int)q.dequeue());
        for(int i = 10; i < 20; i++)
            q.enqueue(i);

        for(int i = 5; i < 20; i++)
            Assert.assertEquals(i, (int)q.dequeue());

        Assert.assertEquals(true, q.empty());
    }
}