package Q8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Q8_14 {
    class Key {
        public Key(String str, boolean val) {
            this.str = str;
            this.val = val;
        }

        String str;
        boolean val;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Key key = (Key) o;
            return val == key.val &&
                    Objects.equals(str, key.str);
        }

        @Override
        public int hashCode() {

            return Objects.hash(str, val);
        }
    }

    Map<Key, Integer> history = new HashMap<>();

    int countEval(String str, boolean val) {

        if (str.length() == 0) return 0;
        else if (str.length() == 1) {
            boolean b = str.charAt(0) == '1' ? true : false;
            return (b == val) ? 1 : 0;
        }
        Key key = new Key(str, val);
        if (history.containsKey(key))
            return history.get(key);

        int total = 0;
        for (int i = 1; i < str.length(); i += 2) {
            char op = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i + 1, str.length());
            int count = 0;
            if (op == '|') {
                if (val) {
                    count = countEval(left, true) * countEval(right, false) +
                            countEval(left, true) * countEval(right, true) +
                            countEval(left, false) * countEval(right, true);
                } else {
                    count = countEval(left, false) * countEval(right, false);
                }
            }
            if (op == '&') {
                if (val) {
                    count = countEval(left, true) * countEval(right, true);
                } else {
                    count = countEval(left, false) * countEval(right, false) +
                            countEval(left, false) * countEval(right, true) +
                            countEval(left, true) * countEval(right, false);
                }
            }
            if (op == '^') {
                if (val) {
                    count = countEval(left, true) * countEval(right, false) +
                            countEval(left, false) * countEval(right, true);
                } else {
                    count = countEval(left, false) * countEval(right, false) +
                            countEval(left, true) * countEval(right, true);
                }
            }
            total += count;
        }
        history.put(key, total);
        return total;
    }

    boolean stringToBool(String c) {
        return c.equals("1") ? true : false;
    }

    int countEval(String s, boolean result, HashMap<String, Integer> memo) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return stringToBool(s) == result ? 1 : 0;

        if (memo.containsKey(result + s))
            return memo.get(result + s);
        int ways = 0;
        for (int i = 1; i < s.length(); i += 2) {
            char c = s.charAt(i);

            String left = s.substring(0, i);
            String right = s.substring(i + 1, s.length());
            int leftTrue = countEval(left, true, memo);
            int leftFalse = countEval(left, false, memo);
            int rightTrue = countEval(right, true, memo);
            int rightFalse = countEval(right, false, memo);
            int total = (leftTrue + leftFalse) * (rightTrue + rightFalse);
            int totalTrue = 0;
            if (c == '^') {
                totalTrue = leftTrue * rightFalse + leftFalse * rightTrue;
            } else if (c == '&') {
                totalTrue = leftTrue * rightTrue;
            } else if (c == '|') {
                totalTrue = leftTrue * rightTrue + leftFalse * rightTrue + leftTrue * rightFalse;
            }
            int subWays = result ? totalTrue : total - totalTrue;
            ways += subWays;
        }
        memo.put(result + s, ways);
        return ways;

    }
}