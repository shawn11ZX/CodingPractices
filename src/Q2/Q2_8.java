package Q2;

public class Q2_8 {
    public static ListNode findLoopStart(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null)
        {
            fast = fast.next;
            fast = fast.next;
            slow = slow.next;
            if(slow == fast)
                break;
        }
        if (fast == null || fast.next == null)
            return null;
        slow = head;
        while(slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;

    }
}
