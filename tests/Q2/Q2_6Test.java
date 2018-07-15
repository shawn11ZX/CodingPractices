package Q2;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q2_6Test {

    @Test
    public void isPalindrome() {
        Assert.assertTrue(Q2_6.isPalindrome(null));
        Assert.assertTrue(Q2_6.isPalindrome(new ListNode(1)));
        Assert.assertFalse(Q2_6.isPalindrome(new ListNode(3, new ListNode(5, new ListNode(8)))));
        Assert.assertTrue(Q2_6.isPalindrome(new ListNode(3, new ListNode(5, new ListNode(3)))));
        Assert.assertTrue(Q2_6.isPalindrome(new ListNode(3, new ListNode(5, new ListNode(5, new ListNode(3))))));
        Assert.assertFalse(Q2_6.isPalindrome(new ListNode(3, new ListNode(5, new ListNode(5, new ListNode(5))))));
    }
}