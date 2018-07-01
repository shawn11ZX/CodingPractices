import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Q1_3Test {

    @Test
    public void URLify() {
        myAssertArrayEquals(Q1_3.URLify(toChar("")), toChar(""));
        myAssertArrayEquals(Q1_3.URLify(toChar(" ")), toChar("%20"));
        myAssertArrayEquals(Q1_3.URLify(toChar("  ")), toChar("%20%20"));
        myAssertArrayEquals(Q1_3.URLify(toChar(" ab")), toChar("%20ab"));
        myAssertArrayEquals(Q1_3.URLify(toChar("ab ")), toChar("ab%20"));
        myAssertArrayEquals(Q1_3.URLify(toChar("ab")), toChar("ab"));
        myAssertArrayEquals(Q1_3.URLify(toChar("a")), toChar("a"));
    }

    private void myAssertArrayEquals(char[] chars, char[] chars1) {
        int i;
        for(i = 0; i < chars.length && chars[i] != '\0'; i++)
        {
            if (chars[i] != chars[i])
                Assert.fail();
        }
        Assert.assertTrue(chars[i] == 0);
    }

    public char[] toChar(String c) {
        char[] rc = c.toCharArray();
        char[] rc2 = new char[(rc.length+1)*3];
        System.arraycopy(rc, 0, rc2, 0, rc.length);
        return rc2;
    }
}