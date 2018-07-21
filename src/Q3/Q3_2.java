package Q3;

public class Q3_2 {
    public static class MinStack {
        int[] data;
        int[] min;
        int top;

        public MinStack(int capacity) {
            this.data = new int[capacity];
            this.min = new int[capacity];
            this.top = 0;
        }

        public boolean push(int v) {
            if (top >= data.length)
                return false;
            data[top] = v;
            min[top] = (top == 0) ? v : Math.min(min[top - 1], v);
            top++;
            return true;
        }

        public int min() {
            if(top == 0)
                throw new  IllegalStateException("stack is empty");
            return min[top -1];
        }
        public int pop() {
            if (top == 0)
                throw new IllegalStateException("stack is empty");
            return data[--top];
        }
    }
}
