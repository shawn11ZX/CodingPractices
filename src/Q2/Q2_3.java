package Q2;

public class Q2_3 {
    public static boolean removeAt(ListNode n)
    {
        if (n == null || n.next == null)
            return false;
        else {
            ListNode next = n.next;
            n.data = next.data;
            n.next = next.next;
            return true;
        }
    }
}
