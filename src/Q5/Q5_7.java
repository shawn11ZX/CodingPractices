package Q5;

public class Q5_7 {
    public static int swapEvenOddBits(int n) {
        int t = 0;
        for (int i = 0; i < 16; i++)
        {
            int even = (n >> (i*2)) & 1;
            int odd = (n >> (i*2+1)) & 1;
            t |= even << (i*2+1) | odd << (i*2);
        }
        return t;
    }

    public static int swapEvenOddBits2(int n) {
        return (n << 1) & 0xaaaaaaaa | (n >> 1) & 0x55555555;
    }
}
