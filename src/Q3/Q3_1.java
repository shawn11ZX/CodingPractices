package Q3;

import com.sun.org.apache.bcel.internal.generic.StackInstruction;

public class Q3_1 {
    public static class MutiStack {
        int[] data;
        Stack[] stacks;
        public MutiStack(int[] data, int n) {
            if (data.length < n)
                throw new IllegalArgumentException("n too larrge");
            this.data = data;
            this.stacks = new Stack[n];
            for(int i = 0; i < n;i++) {
                int start = i* data.length / n;
                int end = (i == n-1) ? data.length : (i+1) * data.length / n;
                int capacity = end - start;
                stacks[i] = new Stack(start, capacity);
            }
        }

        public boolean push(int n, int v)
        {
            return stacks[n].push(v);
        }
        public int pop(int n) {
            return stacks[n].pop();
        }

        public boolean isEmpty(int n) {
            return stacks[n].isEmpty();
        }
        public class Stack {
            final int start;
            final int capacity;
            int top;
            public Stack(int start, int capacity) {
                this.start = start;
                this.capacity = capacity;
                this.top = 0;
            }
            public boolean push(int v) {
                if(top < capacity) {
                    data[start + top] = v;
                    top++;
                    return true;
                }
                return false;
            }
            public int pop() {
                if (top > 0)
                    return data[--top];
                else
                    throw new IllegalStateException("empty");
            }
            public boolean isEmpty() {
                return top == 0;
            }
        }
    }
}
