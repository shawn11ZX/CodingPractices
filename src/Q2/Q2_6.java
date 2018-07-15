package Q2;

public class Q2_6 {
    public static boolean isPalindrome(ListNode head) {
        if(head == null)
            return true;
        int len = getListLength(head);
        if (len == 1) return true;
        int [] stack = new int[len / 2];
        int stackTop = 0;
        ListNode cur = head;
        for(int i = 0; i < len / 2; i++) {
            stack[stackTop++] = cur.data;
            cur = cur.next;
        }
        if ((len % 2) == 1)
            cur = cur.next;
        while(cur != null) {
            if (cur.data != stack[--stackTop])
                return false;
            cur = cur.next;
        }
        return true;
    }

    private static int getListLength(ListNode head) {
        int i = 0;
        while(head != null)
        {
            head = head.next;
            i++;
        }
        return i;

    }
}
