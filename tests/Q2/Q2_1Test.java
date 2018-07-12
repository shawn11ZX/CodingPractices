package Q2;

import org.junit.Test;

import static Q2.Q2_1.removeDups;
import static Q2.Q2_1.removeDups2;

public class Q2_1Test {
    @Test
    public void testRemoveDups() {
        {
            ListNode real = null;
            real = removeDups(real);

            ListNode expect = null;
            ListTestUtils.assertEquals(expect, real);
        }
        {
            ListNode real = new ListNode(1);
            real = removeDups(real);

            ListNode expect = new ListNode(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode real = new ListNode(1, new ListNode(1));
            real = removeDups(real);

            ListNode expect = new ListNode(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode real = new ListNode(1, new ListNode(2, new ListNode(1)));
            real = removeDups(real);

            ListNode expect = new ListNode(1, new ListNode(2));
            ListTestUtils.assertEquals(expect, real);
        }
    }

    @Test
    public void testRemoveDups2() {

        {
            ListNode real = null;
            real = removeDups2(real);

            ListNode expect = null;
            ListTestUtils.assertEquals(expect, real);
        }
        {
            ListNode real = new ListNode(1);
            real = removeDups2(real);

            ListNode expect = new ListNode(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode real = new ListNode(1, new ListNode(1));
            real = removeDups2(real);

            ListNode expect = new ListNode(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            ListNode real = new ListNode(1, new ListNode(2, new ListNode(1)));
            real = removeDups2(real);

            ListNode expect = new ListNode(2, new ListNode(1));
            ListTestUtils.assertEquals(expect, real);
        }
    }
}