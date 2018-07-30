package Q3;

import sun.plugin.dom.exception.InvalidStateException;

public class Q3_3 {
    public static class Stack {
        int [] data;
        int top;

        public Stack(int capacity) {
            data = new int[capacity];
            top = 0;
        }
        public boolean isEmpty() {
            return top == 0;
        }
        public boolean push(int v) {
            if (top < data.length) {
                data[top++] = v;
                return true;
            }
            return false;
        }
        public int pop() {
            if (top == 0)
                throw new InvalidStateException("empty");
            return data[--top];
        }
    }
    public static class SetsOfStack{
        Stack[] stacks;
        int top;
        int singleCapacity;
        public SetsOfStack(int singleCapacity, int setCount) {
            stacks = new Stack[setCount];
            for(int i = 0; i < stacks.length; i++)
            {
                stacks[i] = new Stack(singleCapacity);

            }
            top = 0;
            this.singleCapacity = singleCapacity;
        }

        public boolean push(int v) {
            if(top < 0)
                top = 0;
            while(top < stacks.length) {
                if(stacks[top] == null)
                    stacks[top] = new Stack(singleCapacity);
                if (stacks[top].push(v))
                    return true;
                else
                    top++;
            }
            return false;
        }
        public int pop()
        {
            while(top >= 0) {
                if (stacks[top] == null)
                    top--;
                else if(stacks[top].isEmpty())
                    top--;
                else
                    return stacks[top].pop();
            }
            throw new InvalidStateException("empty");
        }
        public boolean isEmpty() {
            return (top == 0 && (stacks[top] == null || stacks[top].isEmpty()));
        }
        public boolean isEmpty(int i) {
            return (stacks[i] == null || stacks[i].isEmpty());
        }
        public int popAt(int i){
            if (stacks[i] == null || stacks[i].isEmpty())
                throw new InvalidStateException("empty");
            return stacks[i].pop();
        }
    }
}
