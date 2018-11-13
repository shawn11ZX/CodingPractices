package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Q8_9Test {
    @Test
    public void test() {
        {
            LinkedList<String> rt = new LinkedList<>();
            Q8_9.permParan(0, 1, rt, "");
            Assert.assertTrue(rt.size() == 1);
        }
        {
            LinkedList<String> rt = new LinkedList<>();
            Q8_9.permParan(0, 2, rt, "");
            Assert.assertTrue(rt.size() == 2);
        }

        {
            LinkedList<String> rt = new LinkedList<>();
            Q8_9.permParan(0, 3, rt, "");
            Assert.assertTrue(rt.size() == 5);
        }
    }
}