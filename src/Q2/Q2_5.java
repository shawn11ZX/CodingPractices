package Q2;

public class Q2_5 {
    public static ListNode sum(ListNode l, ListNode r) {
        ListNode prev = null, head = null;
        int carry = 0, sum = 0;
        while(l != null || r != null) {
            if(l!= null && r != null)
                sum = l.data + r.data + carry;
            else if( l != null)
                sum = l.data + carry;
            else
                sum = r.data + carry;
            carry = sum / 10;
            prev = append(prev, sum % 10);
            if (head == null) head = prev;

        }
        if (carry != 0 ) {
            prev = append(prev, carry);
            if (head == null) head = prev;
        }
        return head;
    }

    public static ListNode append(ListNode prev, int i) {
        if (prev == null)
            return new ListNode(i);
        else {
            prev.next = new ListNode(i);
            return prev.next;
        }
    }
}
