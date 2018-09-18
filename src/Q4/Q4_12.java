package Q4;

import java.util.HashMap;
import java.util.Map;

public class Q4_12 {
    public static int pathsWithSumFast(BinaryTreeNode  root, int sum)
    {
        HashMap<Integer, Integer> rc = pathsWithSumInt(root);
        return rc.getOrDefault(sum, 0);
    }

    public static HashMap<Integer, Integer> pathsWithSumInt(BinaryTreeNode root)
    {
        HashMap<Integer, Integer> rc = new HashMap<>();
        if (root == null) return rc;
        HashMap<Integer, Integer> l = pathsWithSumInt(root.left);
        HashMap<Integer, Integer> r = pathsWithSumInt(root.right);
        add(rc, l, root.value);
        add(rc, r, root.value);
        return rc;
    }

    private static void add(HashMap<Integer,Integer> rc, HashMap<Integer,Integer> l, int value) {
        for (Map.Entry<Integer, Integer> e: l.entrySet()) {
            int sum = e.getKey() + value;
            int count = rc.getOrDefault(sum, 0) + e.getValue();
            rc.put(sum, count);
        }
    }

    public static int pathsWithSumSlow(BinaryTreeNode root, int targetSum, int runningSum)
    {
        if (root == null)
            return 0;
        int count = 0;
        if (runningSum + root.value == targetSum)
            count+=1;
        count += pathsWithSumSlow(root.left, targetSum, runningSum+root.value);
        count += pathsWithSumSlow(root.right, targetSum, runningSum+root.value);
        count += pathsWithSumSlow(root.left, targetSum, 0);
        count += pathsWithSumSlow(root.right, targetSum, 0);
        return count;
    }
}
