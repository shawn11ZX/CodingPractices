package Q3;

import java.util.Iterator;
import java.util.LinkedList;

public class Q3_6 {
    public static class AnimalShelter {
        LinkedList _list = new LinkedList();
        public void enqueue(Object o) {
            _list.addFirst(o);
        }
        public Object dequeueAny() {
            if (_list.isEmpty())
                return null;
            else
                return _list.removeLast();
        }

        public Object dequeueTyep(Class cls) {
            Iterator itr = _list.descendingIterator();
            while(itr.hasNext()) {
                Object o = itr.next();
                if (o instanceof cls) {
                    itr.remove();
                    return o;
                }
            }
            return null;
        }

    }
}
