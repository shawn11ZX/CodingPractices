package Q2;


import java.util.HashMap;

public class Q2_1 {
    public static class Node {
        Node next;
        int data;
        public Node(int data) {
            this.next = null;
            this.data = data;
        }
        public Node(int data,  Node next) {
            this.next = next;
            this.data = data;
        }
    }

    public static Node removeDups(Node root) {
        HashMap<Integer, Boolean> m = new HashMap<>();
        Node prev = root;
        if(prev == null) return null;
        Node cur = prev.next;
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

    public static  Node removeDups2(Node n) {
        if(n == null) return null;
        if(n.next == null) return n;
        Node newChild = removeDups(n.next);
        for(Node i = newChild; i !=null; i = i.next) {
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
