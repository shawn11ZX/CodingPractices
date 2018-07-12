package Q2;

public class Q2_2
{
    /***
     * suppose distance of tail and front is N ( tail = tail.next N times to reach front)
     * front has to reach null for tail to be Nth to last.
     * @param head
     * @param n
     * @return
     */
    public static ListNode returnNthToLast(ListNode head, int n) {
        ListNode front = head;
        for(int i = 0; i < n; i++) {
            if(front == null)
                return null;
            else
                front = front.next;
        }
        ListNode tail = head;
        while(front != null) {
            front = front.next;
            tail = tail.next;
        }
        return tail;
    }
}
