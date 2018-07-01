import java.util.HashMap;

public class Q1_4 {
    static public boolean isPalindromePermutation(String str) {
        HashMap<Character, Integer> occurances = new HashMap<Character, Integer>();
        for(Character c : str.toCharArray()) {
            Integer i = occurances.get(c);
            if (i == null)
                occurances.put(c, 1);
            else
                occurances.remove(c);
        }
        return occurances.size() == 0 || occurances.size() == 1;
    }

    static public void toggle(int bits, int index) {
        int mask = ~(1 << index);
        bits ^= mask;
    }
    static public boolean isPalindromePermutation2(String str) {
        int bits = 0;
        for(char c: str.toCharArray()) {
            int idx = getCharIndex(c);
            if (idx >= 0 && idx <= 26) {
                toggle(bits, idx);
            }
        }
        return bits == 0 || (bits & (bits - 1)) == 0;
    }

    static int getCharIndex(char c ) {
        if (c >= 'a' && c <= 'z') {
            return c-'a';
        }
        else
            return -1;
    }
}
