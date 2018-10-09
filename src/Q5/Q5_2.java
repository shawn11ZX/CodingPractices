package Q5;

public class Q5_2 {
    public static String printBinary(double d) {
        if (d >= 1 || d < 0) {
            return "ERROR";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        while(d > 0) {
            d = d * 2;
            if (d > 1) {
                sb.append("1");
                d = d - 1;
            }
            else {
                sb.append("0")
            }
        }
        return sb.toString();
    }
}
