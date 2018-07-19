package Q2;

public class Q2_7 {
    public static ListNode intersect(ListNode left, ListNode right) {
        int leftCount = 0;
        int rightCount = 0;
        ListNode leftLast = null;
        ListNode rightLast = null;
        leftLast = left;
        while(leftLast != null && leftLast.next != null)
        {
            leftLast = leftLast.next;
            leftCount++;
        }
        while(rightLast != null && rightLast.next != null)
        {
            rightLast = rightLast.next;
            rightCount++;
        }
        if (leftLast != rightLast)
            return null;
        for(int i = 0; i < leftCount - rightCount; i++)
            left = left.next;
        for(int i = 0; i < rightCount - leftCount; i++)
            right = right.next;
        while(left != right)
        {
            left = left.next;
            right = right.next;
        }
        return left;
    }
}
