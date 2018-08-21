package Q4;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class Q4_3 {
    public static List<List<TreeNode>> getListOfDepth(TreeNode root) {
        List<List<TreeNode>> rc = new ArrayList<>();
        List<TreeNode> curList = new ArrayList<>();
        if(root == null)
            return rc;
        else
            curList.add(root);
        List<TreeNode> nextList = new ArrayList<>();
        do {
            for(TreeNode n : curList)
            {
                for(TreeNode c : n.children) {
                    nextList.add(c);
                }
            }
            if(nextList.size() > 0) {
                rc.add(nextList);
                curList = nextList;
                nextList = new ArrayList<>();
            }
            else {
                return rc;
            }
        } while(true);
    }
}
