package Q4;

import java.util.Stack;

public class Q4_1 {
    static public boolean findRoute(Stack<TreeNode> route, TreeNode start, TreeNode end) {
        route.push(start);
        if (start == end) {
            return true;
        }
        else {
            for(int i = 0; i < start.children.length; i++) {
                if(findRoute(route, start.children[i], end))
                    return true;
            }
        }
        route.pop();
        return false;
    }
}
