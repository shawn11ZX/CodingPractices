package Q2;


import java.util.HashMap;

public class Q2_1 {

    public static ListNode removeDups(ListNode root) {
        HashMap<Integer, Boolean> m = new HashMap<>();
        ListNode prev = root;
        if(prev == null) return null;
        ListNode cur = prev.next;
        save(prev.data, m);
        while(cur != null) {
            if(found(cur.data, m)) {
                prev.next = cur.next;
                cur = cur.next;
            }
            else {
                save(cur.data, m);
                prev = cur;
                cur = cur.next;
            }
        }
        return root;
    }

    public static ListNode removeDups2(ListNode n) {
        if(n == null) return null;
        if(n.next == null) return n;
        ListNode newChild = removeDups(n.next);
        for(ListNode i = newChild; i !=null; i = i.next) {
            if(i.data == n.data)
                return newChild;
        }
        n.next = newChild;
        return n;
    }
    private static  boolean found(int data, HashMap<Integer,Boolean> m) {
        return m.containsKey(data);
    }

    private static void save(int data, HashMap<Integer,Boolean> m) {
        m.put(data, true);
    }
}
