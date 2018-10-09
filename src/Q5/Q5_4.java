package Q5;

public class Q5_4 {
    
    public static int next(int n)
    {
        if (n < 0) return -1;
        int nc = n;
        int c0 = 0;
        while( (nc&1) == 0 && nc != 0)
        {
            nc = nc >> 1;
            c0++;
        }
        int c1 = 0;
        while((nc&1) == 1) {
            nc = nc >> 1;
            c1++;
        }
        int p = c0+c1;
        if (p == 0 || p == 32)
            return -1;
        int rc = n | (1 << p);
        rc = rc & (~((1 << p) - 1));
        rc = rc | ((1 << (c1 - 1)) - 1);
        return rc;
    }
    public static int next2(int n) {
        if (n < 0) return -1;
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

    public static int prev(int n) {
        if (n < 0) return -1;
        int c0 = 0;
        int nc = n;
        while((nc &1) == 1) {
            nc = nc >> 1;
            c0++;
        }
        int c1 = 0;
        while((nc&1) == 0 && nc != 0) {
            nc = nc >> 1;
            c1++;
        }
        if (c1 == 0)
            return -1;
        int p = c0+c1;
        int rc = n & ~(1 << p);
        rc = rc | (1 << (p-1));
        rc = rc & (~((1<<(p-1)) - 1));
        rc = rc | (((1 << c0) - 1) << (c1-1));
        return rc;
    }

    public static int prev2(int n) {
        if (n < 0) return -1;
        int temp = n;
        int c0 = 0;
        int c1 = 0;
        while ((temp & 1) ==1) {
            c1++;
            temp >>= 1;
        }
        if (temp == 0) return -1;
        while(((temp & 1) == 0) && (temp != 0)) {
            c0++;
            temp >>= 1;
        }
        int p = c0+c1;
        n &= ((~0) << (p+1));
        int mask = (1<<(c1+1)) - 1;
        n |= mask << (c0-1);
        return n;
    }
}
