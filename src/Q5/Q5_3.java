package Q5;

public class Q5_3 {
    // misunderstood the question, flip from 0 to 1, not switch two bits
    public static int flipBit(int num)
    {
        if (~num == 0)
            return Integer.BYTES * 8;
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
                prevCount = curCount;
                curCount = 0;
            }
            else {
                totalOne+=1;
                curCount++;
            }
        }
        int c = prevCount + curCount;
        if (c > max) max = c;
        return max+1;

    }
    public static int flipBit2(int a) {
        if (~a == 0)
            return Integer.BYTES * 8;
        int currentLength = 0;
        int previousLength = 0;
        int maxLength = 1;
        while (a != 0) {
            if ((a & 1) == 1) {
                currentLength++;
            } else if ((a & 1) == 0) {
                previousLength = (a & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }
            maxLength = Math.max(previousLength + currentLength + 1, maxLength);
            a >>= 1;
        }
        return maxLength;
    }
}
