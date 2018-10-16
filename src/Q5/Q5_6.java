package Q5;

public class Q5_6 {
    public static int diffBits(int b1, int b2)
    {
        int diff = b1 ^ b2;
        int bits = 0;

        for(bits = 0; diff > 0; diff = diff & (~diff))
            bits++;
        return bits;
    }
    public static int bitSwapRequired(int a, int b) {
        int count = 0;
        for (int c  =  a ^ b; c != 0; c  =  c >> 1)
        {
            count += c & 1;
        }
        return count;
    }
}
