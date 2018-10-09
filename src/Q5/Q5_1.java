package Q5;

public class Q5_1 {
    public static int bitInsertion(int N, int M, int i, int j)
    {
        int jMask = (1 << (j+1)) - 1; // including j
        int iMask = (1 << (i)) - 1; // not including i
        int mask = jMask ^ iMask;
        mask = ~mask;

        int newN = N & mask;
        return newN | (M << i);
    }

    public static int bitInsertion2(int n, int m, int i, int j)
    {
        int allOnes = ~0;
        int left = allOnes << (j + 1);
        int right = (1 << i) - 1;
        int mask = left | right;
        int n_cleared = n & mask;
        int m_shifted = m << i;
        return n_cleared | m_shifted;
    }
}
