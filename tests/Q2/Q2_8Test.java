package Q2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import static Q2.Q2_8.*;
public class Q2_8Test {

    @Test
    public void testFindLoopStart() {
        Assert.assertSame(null, findLoopStart(null));
        Assert.assertSame(null, findLoopStart(new ListNode(1)));

        // tail shorter than loop
        {
            ListNode loopEnd = new ListNode(4);
            ListNode loopStart = new ListNode(1, new ListNode(2, new ListNode(3, loopEnd)));
            loopEnd.next = loopStart;
            ListNode listHead = new ListNode(0, loopStart);
            Assert.assertSame(loopStart, findLoopStart(listHead));
        }
        // tail longer than loop
        {
            ListNode loopEnd = new ListNode(4);
            ListNode loopStart = new ListNode(1, new ListNode(2, loopEnd));
            loopEnd.next = loopStart;
            ListNode listHead = new ListNode(0, new ListNode(1, new ListNode(2, loopStart)));
            Assert.assertSame(loopStart, findLoopStart(listHead));
        }
    }
}