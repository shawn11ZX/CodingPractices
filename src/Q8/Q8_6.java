package Q8;

import java.util.LinkedList;
import java.util.Objects;

public class Q8_6 {
    public static class Step {
        public int from;
        public int to;

        public Step(int from, int to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Step step = (Step) o;
            return from == step.from &&
                    to == step.to;
        }

        @Override
        public int hashCode() {

            return Objects.hash(from, to);
        }
    }
    public static void solve(int height, int from ,int to, LinkedList<Step> rc) {
        if (height == 1) {
            rc.addLast(new Step(from, to));
            return;
        }
        else {
            int mid = 6 - from - to;
            solve(height-1, from, mid, rc);
            rc.addLast(new Step(from, to));
            solve(height-1, mid, to, rc);
        }
    }
}
