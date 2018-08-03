package Q3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;

public class Q3_6 {
    public static class Cat {
        int id;

        public Cat(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Cat cat = (Cat) o;
            return id == cat.id;
        }

        @Override
        public int hashCode() {

            return Objects.hash(id);
        }
    }
    public static class Dog {
        int id;

        public Dog(int id) {
            this.id = id;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Dog dog = (Dog) o;
            return id == dog.id;
        }

        @Override
        public int hashCode() {

            return Objects.hash(id);
        }
    }
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

        public Object dequeueType(Class cls) {
            Iterator itr = _list.descendingIterator();
            while(itr.hasNext()) {
                Object o = itr.next();
                if (o.getClass() == cls) {
                    itr.remove();
                    return o;
                }
            }
            return null;
        }

    }
}
