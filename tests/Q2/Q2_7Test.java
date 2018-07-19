package Q2;

import org.junit.Assert;
import org.junit.Test;

import static Q2.Q2_7.intersect;
import static org.junit.Assert.*;

public class Q2_7Test {

    @Test
    public void testIntersect() {
        Assert.assertTrue(intersect(null, null) == null);
        Assert.assertTrue(intersect(new ListNode(1), null) == null);
        {
            ListNode common = new ListNode(1);
            Assert.assertTrue(intersect(new ListNode(1, common), new ListNode(2, common)) == common);
        }
        {
            ListNode common = new ListNode(1);
            Assert.assertTrue(intersect(new ListNode(2, new ListNode(1, common)), new ListNode(2, common)) == common);
        }
        {
            ListNode common = new ListNode(1);
            Assert.assertTrue(intersect(new ListNode(2, common), new ListNode(2, new ListNode(1, common))) == common);
        }

        {
            ListNode common = new ListNode(3, new ListNode(1));
            Assert.assertTrue(intersect(new ListNode(2, new ListNode(1, common)), new ListNode(2, common)) == common);
        }
        {
            ListNode common = new ListNode(3, new ListNode(1));
            Assert.assertTrue(intersect(new ListNode(2, common), new ListNode(2, new ListNode(1, common))) == common);
        }
    }
}