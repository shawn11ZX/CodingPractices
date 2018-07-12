package Q2;

import org.junit.Assert;
import org.junit.Test;

import static Q2.Q2_2.returnNthToLast;

public class Q2_2Test {

    @Test
    public void testReturnNthToLast() {
        {
            ListNode n = returnNthToLast(null, 0);
            Assert.assertTrue(n == null);
        }

        {
            ListNode head = new ListNode(1);
            ListNode n = returnNthToLast(head, 1);
            Assert.assertTrue(n.data == 1);

            ListNode n2 = returnNthToLast(head, 2);
            Assert.assertTrue(n2 == null);
        }

        {
            ListNode head = new ListNode(1, new ListNode(2, new ListNode(3)));
            ListNode n = returnNthToLast(head, 1);
            Assert.assertTrue(n.data == 3);

            ListNode n1 = returnNthToLast(head, 2);
            Assert.assertTrue(n1.data == 2);

            ListNode n2 = returnNthToLast(head, 3);
            Assert.assertTrue(n2.data == 1);

            ListNode n3 = returnNthToLast(head, 4);
            Assert.assertTrue(n3 == null);
        }
    }
}