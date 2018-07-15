package Q2;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_4Test {

    @Test
    public void testPartation() {
        {
            ListNode input = new ListNode(3, new ListNode(5, new ListNode(8, new ListNode(5, new ListNode(10, new ListNode(2, new ListNode(1)))))));
            ListNode expect = new ListNode(3, new ListNode(2, new ListNode(1, new ListNode(5, new ListNode(10, new ListNode(5, new ListNode(8)))))));

            Q2_4.partation(input, 5);
            ListTestUtils.assertEquals(input, expect);
        }

        {
            ListNode input = new ListNode(3);
            ListNode expect = new ListNode(3);

            Q2_4.partation(input, 5);
            ListTestUtils.assertEquals(input, expect);
        }


        {
            ListNode input = new ListNode(3);
            ListNode expect = new ListNode(3);

            Q2_4.partation(input, 1);
            ListTestUtils.assertEquals(input, expect);
        }

        {
            ListNode input = null;
            ListNode expect = null;

            Q2_4.partation(input, 1);
            ListTestUtils.assertEquals(input, expect);
        }
    }

    @Test
    public void testPartation2() {
        {
            ListNode input = new ListNode(3, new ListNode(5, new ListNode(8, new ListNode(5, new ListNode(10, new ListNode(2, new ListNode(1)))))));
            ListNode expect = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5, new ListNode(8, new ListNode(5, new ListNode(10)))))));

            input = Q2_4.partition2(input, 5);
            ListTestUtils.assertEquals(input, expect);
        }

        {
            ListNode input = new ListNode(3);
            ListNode expect = new ListNode(3);

            input = Q2_4.partition2(input, 5);
            ListTestUtils.assertEquals(input, expect);
        }


        {
            ListNode input = new ListNode(3);
            ListNode expect = new ListNode(3);

            input = Q2_4.partition2(input, 1);
            ListTestUtils.assertEquals(input, expect);
        }

        {
            ListNode input = null;
            ListNode expect = null;

            input = Q2_4.partition2(input, 1);
            ListTestUtils.assertEquals(input, expect);
        }
    }
}