package Q8;

import Q4.Q4_11;

import java.util.ArrayList;
import java.util.HashMap;

public class Q8_8 {
    public static void perm(String str, ArrayList<String> result)
    {
        HashMap<Character, Integer> map = preprocess(str);
        perm(map, result, str.length(), "");
    }

    private static HashMap<Character, Integer> preprocess(String str) {
        HashMap<Character, Integer> rt = new HashMap<Character, Integer>();
        for(Character c: str.toCharArray())
        {
            Integer count = rt.getOrDefault(c, 0);
            rt.put(c, count+1);
        }
        return rt;
    }

    private static void perm(HashMap<Character,Integer> map, ArrayList<String> result, int length, String prefix) {
        if (length == 0)
        {
            result.add(prefix);
            return;
        }
        for (Character c: map.keySet()) {
            int count = map.get(c);
            if (count > 0)
            {
                map.put(c, count-1);
                perm(map, result, length-1, prefix+c);
                map.put(c, count);
            }
        }
    }
}
