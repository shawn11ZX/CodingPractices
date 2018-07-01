public class Q1_2 {
    static public boolean isSamePermutation(String left, String right) {
        int [] count = new int[256];
        for(int i = 0; i < left.length(); i++)
            count[left.charAt(i)]++;
        for(int j = 0; j < right.length(); j++) {
            if (count[right.charAt(j)] == 0)
                return false;
            else
                count[right.charAt(j)]--;
        }
        for(int i = 0 ; i < count.length; i++)
            if (count[i] != 0)
                return false;
        return true;
    }
    static public boolean isSamePermutation2(String left, String right) {
        if (left.length() != right.length())
            return false;
        boolean[] used = new boolean[right.length()];
        for(int i = 0; i < left.length(); i++) {
            boolean found = false; // original error
            for(int j = 0; j <right.length(); j++) {
                if(!used[j] && right.charAt(j) == left.charAt(i)) {
                    used[j] = true;
                    found = true;
                    break;
                }
                else {
                    //return false; // error
                }
            }
            if (!found)
                return false;
        }
        return true;
    }
}
