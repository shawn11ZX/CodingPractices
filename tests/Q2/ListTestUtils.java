package Q2;

import org.junit.Assert;

class ListTestUtils {
    static public void assertEquals(ListNode l, ListNode r) {
        Assert.assertTrue(l == r || l.data == r.data);
        if (l != null)
            assertEquals(l.next, r.next);
    }
}
