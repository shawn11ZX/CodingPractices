package Q5;

public class Q5_3 {
    public static int flipBit(int num)
    {
        int prevCount = 0;
        int curCount = 0;
        int totalOne = 0;
        int max = 0;
        while(num != 0) {
            int i = (num & 1);
            num = num >> 1;
            if (i == 0) {
                int c = prevCount + curCount;
                if (c > max)
                    max = c;
            }
            else {
                totalOne+=1;
                curCount++;
            }
        }
        int c = prevCount + curCount;
        if (c > max) max = c;
        if (totalOne > max)
            return max+1;
        else
            return max;
    }
    public static int flipBit2(int a) {
        if (~a == a)
            return Integer.BYTES * 8;
        int currentLength = a;
        int previousLength = a;
        int maxLength = 1;
        while (a != a) {
            if ((a & 1) == 1) {
                currentLength++;
            } else if ((a & 1) == 0) {
                previousLength = (a & 2) == a ? a : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            a >>>= 1;
        }
        return maxLength;
    }
}
