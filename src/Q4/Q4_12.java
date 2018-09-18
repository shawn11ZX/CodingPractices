package Q4;

import java.util.HashMap;
import java.util.Map;

public class Q4_12 {
    public static int pathsWithSumFast(BinaryTreeNode  root, int sum)
    {
        NodePaths rc = pathsWithSumInt(root);
        return rc.continuousMap.getOrDefault(sum, 0) + rc.otherMap.getOrDefault(sum, 0);
    }

    static class NodePaths {
        public HashMap<Integer, Integer> continuousMap = new HashMap<>(); // child + current
        public HashMap<Integer, Integer> otherMap = new HashMap<>(); // history of child
    }
    public static NodePaths pathsWithSumInt(BinaryTreeNode root)
    {
        NodePaths  rc = new NodePaths();
        if (root == null) return rc;
        NodePaths  l = pathsWithSumInt(root.left);
        NodePaths  r = pathsWithSumInt(root.right);
        add(rc, l, root.value);
        add(rc, r, root.value);
        rc.continuousMap.put(root.value, rc.continuousMap.getOrDefault(root.value, 0) + 1);

        return rc;
    }

    private static void add(NodePaths  rc, NodePaths  l, int value) {
        for (Map.Entry<Integer, Integer> e: l.continuousMap.entrySet()) {
            int sum = e.getKey() + value;
            int count = rc.continuousMap.getOrDefault(sum, 0) + e.getValue();
            rc.continuousMap.put(sum, count);
        }

        for (Map.Entry<Integer, Integer> e: l.continuousMap.entrySet()) {
            rc.otherMap.put(e.getKey(), e.getValue() + rc.otherMap.getOrDefault(e.getKey(), 0));
        }
        for (Map.Entry<Integer, Integer> e: l.otherMap.entrySet()) {
            rc.otherMap.put(e.getKey(), e.getValue()+ rc.otherMap.getOrDefault(e.getKey(), 0));
        }
    }

    public static int pathsWithSumSlow(BinaryTreeNode root, int targetSum, int runningSum)
    {
        if (root == null)
            return 0;
        int count = 0;
        if (runningSum + root.value == targetSum)
            count+=1;
        count += pathsWithSumSlow(root.left, targetSum, runningSum + root.value);
        count += pathsWithSumSlow(root.right, targetSum, runningSum + root.value);
        count += pathsWithSumSlow(root.left, targetSum, 0);
        count += pathsWithSumSlow(root.right, targetSum, 0);
        return count;
    }
}
