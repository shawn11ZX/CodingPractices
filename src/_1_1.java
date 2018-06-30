import java.util.HashMap;

public class _1_1 {
    static public boolean isUnique(String str) {
        boolean[] found = new boolean[256];
        for(int i = 0; i < str.length();i++) {
            char c = str.charAt(i);
            if (c > 255) {
                throw new IllegalArgumentException("invalid char at" + i);
            }
            if (found[c])
                return false;
            else
                found[c] = true;
        }
        return true;
    }

    static public boolean isUnique2(String str) {
        HashMap<Character, Boolean> history = new HashMap<Character, Boolean>();
        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(history.containsKey(c))
                return false;
            else
                history.put(c, true);
        }
        return true;
    }

    static public boolean isUnique3(String str) {
        for(int i = 0; i < str.length();i++) {
            for(int j = i+1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)) {
                    return false;
                }

            }
        }
        return true;
    }
}
