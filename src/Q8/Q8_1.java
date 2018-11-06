package Q8;

public class Q8_1 {
    static public int countWays2(int n)
    {
        int[] history = new int[n+1];
        history[0] = 1; // there is only one way to stand still
        for (int i = 1; i <= n; i++)
        {
            int n2 = i-2;
            int n1 = n-1;
            int n3 = n-3;

            int c = 0;
            if (n2 >= 0)
                c += history[n2];
            if (n3 >= 0)
                c+= history[n3];
            if (n1 >= 0)
                c += history[n1];
            history[n] = c;
        }
        return history[n];
    }

    static public int countWays(int n) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else {
            return countWays(n-1) + countWays(n-2) + countWays(n-3); }
    }
}
