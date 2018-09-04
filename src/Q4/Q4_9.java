package Q4;

import java.util.ArrayList;
import java.util.Stack;

public class Q4_9 {
    public static void weave(
            ArrayList<Integer> left,
            ArrayList<Integer> right,
            Stack<Integer> work,
            int leftIndex,
            int rightIndex,
            ArrayList<ArrayList<Integer>> result)
    {
        if(leftIndex == left.size() || rightIndex == right.size()) {
            ArrayList<Integer> l = new ArrayList<>();
            for (int i = leftIndex; i < left.size(); i++) {
                l.add(left.get(i));
            }
            for (int i = rightIndex; i < right.size(); i++) {
                l.add(right.get(i));
            }
            result.add(l);
        }
        work.push(left.get(leftIndex));
        weave(left, right, work, leftIndex+1, rightIndex, result);
        work.pop();

        work.push(right.get(rightIndex));
        weave(left, right, work, leftIndex, rightIndex+1, result);
        work.pop();
    }

    public static ArrayList<ArrayList<Integer>> allSequences(BSTNode root) {
        if(root == null)
            return new ArrayList<>();
        ArrayList<ArrayList<Integer>> leftSeq = allSequences(root.left);
        ArrayList<ArrayList<Integer>> rightSeq = allSequences(root.right);

        ArrayList<ArrayList<Integer>> rc = new ArrayList<>();
        Stack<Integer> work = new Stack<>();
        work.push(root.k);
        for(ArrayList<Integer> left : leftSeq)
        {
            for(ArrayList<Integer> right : rightSeq)
            {
                weave(left, right, work, 0, 0, rc);
            }
        }
        return rc;
    }
}
