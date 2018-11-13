package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_8Test {
    @Test
    public void test() {
        {
            ArrayList<String> rt = new ArrayList<>();
            Q8_8.perm("", rt);
            Assert.assertTrue(rt.size() == 1);
        }

        {
            ArrayList<String> rt = new ArrayList<>();
            Q8_8.perm("a", rt);
            Assert.assertTrue(rt.size() == 1);
        }

        {
            ArrayList<String> rt = new ArrayList<>();
            Q8_8.perm("aaaa", rt);
            Assert.assertTrue(rt.size() == 1);
        }

        {
            ArrayList<String> rt = new ArrayList<>();
            Q8_8.perm("abc", rt);
            Assert.assertTrue(rt.size() == 6);
        }


    }
}