package Q5;

public class Q5_4 {
    
    public static int next(int n)
    {
        int rightOne = (((n-1)^n) >> 1) + 1;
        int leftZero = ((n-1)|n) + 1;
        if  (leftZero == 0)
            return n;
        if (rightOne == 0)
            return n;
        n = n | leftZero;
        n = n & (~rightOne);
        return n;
    }
    public static int next2(int n) {
        int c = n;
        int c0 = 0;
        int c1 = 0;
        while (((c & 1) == 0) && (c != 0)) {
            c0++;
            c >>= 1;
        }
        while ((c & 1) == 1) {
            c1++;
            c >>= 1;
        }

        if (c0 + c1 == 31 || c0 + c1 == 0)
            return -1;
        int p = c0 + c1; // position of rightmost non-trailing zero
        n |= (1 << p); // Flip rightmost non-trailing zero
        n &= ~((1 << p) - 1); // Clear all bits to the right of p
        n |= (1 << (c1 - 1)) - 1;
        return n;
    }
}
