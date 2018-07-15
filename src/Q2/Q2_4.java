package Q2;

public class Q2_4 {
    public static void partation(ListNode head, int pivot) {
        ListNode cur = head;
        do {
            while(cur != null && cur.data < pivot)
                cur = cur.next;
            if (cur == null)
                return;
            ListNode target = cur.next;
            while (target != null && target.data >= pivot)
                target = target.next;
            if (target == null)
                return;
            int temp = cur.data;
            cur.data = target.data;
            target.data = temp;
            cur = target.next;
        } while(true);
    }
}
