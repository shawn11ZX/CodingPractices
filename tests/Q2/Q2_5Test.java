package Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_5Test {

    @Test
    public void testSum() {
        {
            ListNode left = new ListNode(3, new ListNode(5, new ListNode(8)));
            ListNode right = new ListNode(3, new ListNode(5, new ListNode(8)));
            ListNode expect = new ListNode(6, new ListNode(0, new ListNode(7, new ListNode(1))));
            ListNode real = Q2_5.sum(left, right);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode left = new ListNode(3, new ListNode(5, new ListNode(8)));
            ListNode right = new ListNode(3, new ListNode(5));
            ListNode expect = new ListNode(6, new ListNode(0, new ListNode(9)));
            ListNode real = Q2_5.sum(left, right);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode left = new ListNode(3, new ListNode(5, new ListNode(8)));
            ListNode right = null;
            ListNode expect = new ListNode(3, new ListNode(5, new ListNode(8)));
            ListNode real = Q2_5.sum(left, right);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode left = null;
            ListNode right = null;
            ListNode expect = null;
            ListNode real = Q2_5.sum(left, right);
            ListTestUtils.assertEquals(expect, real);
        }
    }
}