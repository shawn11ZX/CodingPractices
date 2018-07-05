package Q1;

public class Q1_5 {
    public static boolean isOneWay(String left, String right) {
        if (left.length() == right.length())
            return isOneWayByReplace(left, right);
        else if (left.length() == right.length() - 1)
            return isOneWayByInsert(left, right);
        else if (left.length() == right.length() + 1)
            return isOneWayByInsert(right, left);
        return false;
    }

    private static boolean isOneWayByReplace(String left, String right) {
        int diffCount = 0;
        for(int i = 0; i < left.length();i ++) {
            if (left.charAt(i) != right.charAt(i)) {
                diffCount++;
                if (diffCount >= 2)
                    return false;
            }
        }
        return diffCount == 1;
    }

    private static boolean isOneWayByInsert(String shorter, String longer) {
        boolean diffFound = false;
        int l = 0;
        int r = 0;
        while(l < shorter.length() && r < longer.length()) {
            if (shorter.charAt(l) != longer.charAt(r)) {
                if (diffFound)
                    return false;
                diffFound = true;
                l++;
            } else {
                l++;
                r++;
            }
        }
        return true;
    }
}
