package misc;
import java.math.BigInteger;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestFloat {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    //			  			  "seeeeeeeemmmmmmmmmmmmmmmmmmmmmmm"
    String zero 			= "00000000000000000000000000000000";

    String one  			= "00111111100000000000000000000000";
    String two  			= "01000000000000000000000000000000";

    String none 			= "10111111100000000000000000000000";
    String ntwo 			= "11000000000000000000000000000000";

    String smallestNormal 	= "00000000100000000000000000000000";
    String smallestFloat  	= "00000000000000000000000000000001";


    ///////////////////////////////////////////////////////

    public float stringBitsToFloat(String bits) {
        int i = Integer.parseUnsignedInt(bits, 2);
        float f = Float.intBitsToFloat(i);
        return f;
    }
    public void assertEqual(int expected, String bits)
    {
        float f = stringBitsToFloat(bits);

        Assert.assertEquals(expected, (int)f);
    }

    void printIntegerAsBits(int i)
    {
        System.out.println(String.format("      : |[seeeeeeeemmmmmmmmmmmmmmmmmmmmmmm]"));
        System.out.println(String.format("int   : |[%32s]", Integer.toBinaryString(i)));
    }


    void printFloatAsBits(float f, String msg)
    {
        System.out.println(msg);
        System.out.println(String.format("      : |[seeeeeeeemmmmmmmmmmmmmmmmmmmmmmm]"));
        System.out.println(String.format("float : |[%32s]", Integer.toBinaryString(Float.floatToRawIntBits(f))));
    }

    void printFloatAsBits(float f)
    {
        System.out.println(String.format("      : |[seeeeeeeemmmmmmmmmmmmmmmmmmmmmmm]"));
        System.out.println(String.format("float : |[%32s]", Integer.toBinaryString(Float.floatToRawIntBits(f))));
    }



    ///////////////////////////////////////////////////////

    @Test
    public void testExcatReprentation() {
        int expected = 0;
        String bits = zero;
        assertEqual(expected, bits);

        expected = 1;
        bits = one;
        assertEqual(expected, bits);


        expected = 2;
        bits = two;
        assertEqual(expected, bits);

        expected = -1;
        bits = none;
        assertEqual(expected, bits);

        expected = -2;
        bits = ntwo;
        assertEqual(expected, bits);
    }



    /**
     * Float numbers smaller than 2^(M+1) can have precision less than 1
     */

    @Test
    public void testNotLostPrecision() {
        int i = (1 << 24) - 3;
        float f = i;


        System.out.println(String.format("==================="));
        printIntegerAsBits(i);
        printFloatAsBits(f);

        f = f + 2;
        i = i + 2;
        printIntegerAsBits(i);
        printFloatAsBits(f);

        Assert.assertTrue("precision should not be lost", (int)f == i);
    }



    /**
     * Float numbers larger than 2^(M+1) will have error lager than 1
     */
    @Test
    public void testLostPrecision() {
        int i = (1 << 24) - 1;
        float f = i;

        System.out.println(String.format("==================="));
        printIntegerAsBits(i);
        printFloatAsBits(f);

        f = f + 2;
        i = i + 2;
        printIntegerAsBits(i);
        printFloatAsBits(f);

        Assert.assertTrue("precision should be lost", (int)f < i);
    }


    float dummyFun(float f)
    {
        return f / 2;
    }

    /**
     * seems denormalized float does not have performance issue?
     */
    @Test
    public void testDenormalizePerformance() {

        timeAccessFloat(1);

        float f = stringBitsToFloat(this.smallestNormal);
        timeAccessFloat(f);
        printFloatAsBits(f, "smallestNormal");
        Assert.assertTrue(f > 0);

        f = f / 2.0f;
        timeAccessFloat(f);
        printFloatAsBits(f, "smallestNormal/2");
        Assert.assertTrue(f > 0);

        f = f / 4.0f;
        timeAccessFloat(f);
        printFloatAsBits(f, "smallestNormal/8");
        Assert.assertTrue(f > 0);


        timeAccessFloat(1.0e-40f);
        printFloatAsBits(f, "1.0e-40f");
        Assert.assertTrue(f > 0);

        f = stringBitsToFloat(this.smallestFloat);
        timeAccessFloat(f);
        printFloatAsBits(f, "smallestFloat");
        Assert.assertTrue(f > 0);

    }


    private float timeAccessFloat(float f) {


        long start = System.currentTimeMillis();
        float tmp = 0;
        for (int i = 0; i < 100000000; i++)
        {
            tmp = tmp + dummyFun(f);
        }

        long end = System.currentTimeMillis();
        System.out.println(String.format("%f, time=%d", f, end - start));
        return tmp;
    }
}