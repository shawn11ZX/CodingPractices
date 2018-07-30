package Q3;

import java.util.Stack;

public class Q3_4 {
    public static class QueueViaStack<E> {
        Stack<E> s = new Stack<>();
        Stack<E> r = new Stack<>();
        public void enqueue(E e) {
            s.push(e);
        }
        public E dequeue() {
            if (empty())
                throw new IllegalStateException("empty");
            if (r.empty())
                while(!s.empty())
                    r.push(s.pop());
            return r.pop();
        }
        public boolean empty() {
            return s.empty() && r.empty();
        }
    }
}
