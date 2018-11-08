package Q8;

public class Q8_5 {
    public static int multi(int a, int b)
    {
        int rc = 0;
        for (int offset = 0 ; offset < 32; offset++)
        {
            if (((a >> offset) & 1) == 1)
                rc += (b << offset);
        }
        return rc;
    }

    public static int multiRecu(int a, int b)
    {
        if (b==0)
            return 0;
        int rc = 0;
        if ((b &1) == 1)
            rc += a;
        rc += (multiRecu(a, b >> 1) << 1);
        return rc;
    }


}
