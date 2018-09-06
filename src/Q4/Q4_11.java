package Q4;

import java.util.Random;

public class Q4_11 {
    public static class Param {
        public int n;
    }
    public static BSTNode random(BSTNode root) {
        Random rand = new Random();
        int n = rand.nextInt() % BSTNode.getSize(root);
        Param param = new Param();
        param.n = n;
        return getNth(root, param);
    }

    private static BSTNode getNth(BSTNode root, Param param) {

        if (param.n == 0 )
            return root;
        param.n -= 1;
        BSTNode rc = getNth(root.left, param);
        if (rc != null)
            return rc;
        rc = getNth(root.right, param);
        return rc;
    }
}
