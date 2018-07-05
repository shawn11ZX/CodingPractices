package Q1;

import java.util.HashMap;

/**
 * - only alphabet characters are allowed in words.
 * - space character is not counted.
 * - no capital alphabet character is allowed.
 */
public class Q1_4 {
    static public boolean isPalindromePermutation(String str) {
        HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
        for(Character c : str.toCharArray()) {
            Integer i = occurrences.get(c);
            if (i == null)
                occurrences.put(c, 1);
            else
                occurrences.remove(c);
        }
        return occurrences.size() == 0 || occurrences.size() == 1;
    }

    static public int toggle(int bits, int index) {
        int mask = (1 << index);
        bits ^= mask;
        return bits;
    }
    static public boolean isPalindromePermutation2(String str) {
        int bits = 0;
        for(char c: str.toCharArray()) {
            int idx = getCharIndex(c);
            if (idx >= 0 && idx <= 26) {
                bits = toggle(bits, idx);
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
