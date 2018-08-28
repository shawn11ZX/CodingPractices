package Q4;

public class BSTNode {
    public int k;
    public int v;
    BSTNode left;
    BSTNode right;

    public BSTNode(int k, int v) {
        this.k = k;
        this.v = v;
    }

    public static BSTNode find(BSTNode root, int k) {
        if(root == null)
            return null;
        if (root.k == k)
            return root;
        else if (k <= root.k)
        {
            return find(root.left, k);
        }
        else {
            return find(root.right, k);
        }
    }
    public static BSTNode insert(BSTNode root, int k, int v)
    {
        if (root == null)
            return new BSTNode(k, v);
        else if (k <= root.k) {
            root.left = insert(root.left, k, v);
            return root;
        }
        else {
            root.right = insert(root.right, k, v);
            return root;
        }
    }

    public static class LargestResult {
        public BSTNode largest;
        public BSTNode newRoot;
    }

    static LargestResult  removeLargest(BSTNode n)
    {
        LargestResult rc = new LargestResult();
        if(n.right == null)
        {
            rc.largest = n;
            rc.newRoot = n.left;
            return rc;
        }
        else {
            BSTNode prev = n;
            BSTNode cur = n.right;
            while(cur.right != null)
            {
                prev = cur;
                cur = cur.right;
            }
            prev.right = cur.left;
            rc.largest = cur;
            rc.newRoot = n;
            return rc;
        }
    }

    public static BSTNode delete(BSTNode root, int k) {
        if (root == null)
            return null;
        else if (root.k == k)
        {
            if (root.left != null && root.right != null)
            {
                LargestResult rc = removeLargest(root.left);
                rc.largest.left = rc.newRoot;
                rc.largest.right = root.right;
                return rc.largest;
            }
            else if(root.left != null) {
                return root.left;
            }
            else if (root.right != null)
            {
                return root.right;
            }
            else {
                return null;
            }
        }
        else if (k <= root.k)
        {
            root.left = delete (root.left, k);
            return root;
        }
        else {
            root.right = delete (root.right, k);
            return root;
        }
    }
}
