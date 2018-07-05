package Q1;

public class Q1_6 {
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();
        int curCount = 0;
        char curChar = 0;
        for(char c: str.toCharArray()) {
            if (c == curChar)
                curCount++;
            else {
                Output(sb, curChar, curCount);
                curChar = c;
                curCount = 1;
            }
        }
        Output(sb, curChar, curCount);
        String rc = sb.toString();
        return rc.length() < str.length() ? rc : str;
    }

    private static void Output(StringBuilder sb, char curChar, int curCount) {
        if (curCount > 0) {
            sb.append(curChar);
            sb.append(curCount);
        }
    }
}
