package Q3;

import java.util.Stack;

public class Q3_5 {
    public static <T extends Comparable<T>> void sort(Stack<T> s)
    {
        Stack<T> t = new Stack<>();
        while(!s.empty()) {
            T item = s.pop();
            if (t.empty()) t.push(item);
            else {
                while(!t.empty() && t.peek().compareTo(item) > 0)
                    s.push(t.pop());
                t.push(item);
            }
        }
        while(!t.empty())
            s.push(t.pop());
    }
}
