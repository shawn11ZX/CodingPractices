package Q4;

public class Q4_10 {
    public static boolean isSubTree(BSTNode big, BSTNode small)
    {
        if(big == null && small == null)
            return true;
        else if (big == null && small != null || big != null && small == null)
            return false;
        else {
            if (big.k == small.k && isSubTree(big.right, small.right) && isSubTree(big.left, small.left))
                return true;
            else if (isSubTree(big.left, small) || isSubTree(big.right, small))
                return true;
            else
                return false;
        }
    }
}
