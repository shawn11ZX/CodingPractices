package Q8;

import java.util.HashMap;
import java.util.Map;

public class Q8_11 {
    public static int hitCount;
    public static int permChanges(int n, int [] changes, int cur, Map m)
    {
        int key = (n<<8) | cur;
        if (m.containsKey(key)) {
            hitCount++;
            return (Integer) m.get(key);
        }
        int change = changes[cur];
        if (cur == changes.length-1)
            return ((n%change) == 0) ? 1: 0;
        int types = n / change;
        int rc = 0;
        for(int i = 0; i <= types; i++)
            rc += permChanges(n-i*change, changes, cur+1, m);
        m.put(key, rc);
        return rc;
    }
    public static int makeChange2(int n) {
        int[] denoms = {25, 10, 5, 1};
        return permChanges(n, denoms , 0, new HashMap());
    }

    public static int makeChange(int n) {
        int[] denoms = {25, 10, 5, 1};
        int[][] map = new int[n + 1][denoms.length];
        return makeChange(n, denoms, 0, map);
    }
    public static int makeChange(int amount, int[] denoms, int index, int[][] map) {
        if (map[amount][index] > 0) {
            return map[amount][index];
        }
        if (index >= denoms.length - 1)
            return 1;
        int denomAmount = denoms[index];
        int ways = 0;
        for (int i  = 0; i * denomAmount <= amount; i++) {
            int amountRemaining = amount - i * denomAmount;
            ways += makeChange(amountRemaining, denoms, index +  1, map);
        }
        map[amount][index] = ways;
        return ways;
    }
}
