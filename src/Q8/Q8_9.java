package Q8;

import java.util.LinkedList;

public class Q8_9 {
    public static void permParan(int leftExtra, int leftRemain, LinkedList<String> rt, String prefix) {
        if (leftExtra == 0 && leftRemain == 0) {
            rt.add(prefix);
            return;
        }
        else {
            if (leftExtra > 0)
                permParan(leftExtra -1, leftRemain, rt, prefix+")");;
            if (leftRemain > 0)
                permParan(leftExtra + 1, leftRemain - 1, rt, prefix+"(");;
        }
    }
}
