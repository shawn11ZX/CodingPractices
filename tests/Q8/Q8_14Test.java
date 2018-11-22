package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Q8_14Test {
    @Test
    public void test() {
        {
            Q8_14 test = new Q8_14();
            String exp = "1^0|0|1";
            HashMap<String, Integer> his = new HashMap<>();
            int realFalse = test.countEval(exp, false);
            int expectFalse = test.countEval(exp, false, his);
            int realTrue = test.countEval(exp, true);
            int expectTrue = test.countEval(exp, true, his);
            Assert.assertEquals(exp, expectFalse, realFalse);
            Assert.assertEquals(exp, expectTrue, realTrue);
        }
    }
}