package Q2;

import org.junit.Assert;
import org.junit.Test;

import static Q2.Q2_3.removeAt;
import static org.junit.Assert.*;

public class Q2_3Test {

    @Test
    public void testRemoveAt() {
        {
            ListNode n1 = new ListNode(3);
            ListNode n2 = new ListNode(2, n1);
            ListNode head = new ListNode(1, n2);

            ListNode n11 = new ListNode(3);
            ListNode head1 = new ListNode(1, n11);
            Assert.assertTrue(removeAt(n2));
            ListTestUtils.assertEquals(head, head1);
        }

    }
}