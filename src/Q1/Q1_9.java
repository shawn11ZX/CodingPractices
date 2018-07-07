package Q1;

public class Q1_9 {
    static public boolean isStringRotate(String left, String right) {
        if (left.length() != right.length())
            return false;
        String twoLeft = left + left;
        return twoLeft.contains(right);
    }
}
