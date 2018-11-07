package Q8;

public class Q8_3 {
    public static int magicNumber(int[] a) {
        if (a.length == 0 || a[0] > 0 || a[a.length - 1] < a.length-1)
            return -1;
        return search(a, 0, a.length);
    }

    private static int search(int[] a, int left, int right) {
        if (left >= right)
            return -1;
        int mid = (left+right) / 2;
        if (a[mid] == mid)
            return mid;
        else if (a[mid] > mid)
            return search(a, left, mid);
        else
            return search(a, mid+1, right);
    }
}
