package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Q8_6Test {
    @Test
    public void test() {
        LinkedList<Q8_6.Step> rc = new LinkedList<>();
        Q8_6.solve(3, 1, 3, rc);
        Assert.assertArrayEquals(new Q8_6.Step[] {
                new Q8_6.Step(1, 3),
                new Q8_6.Step(1, 2),
                new Q8_6.Step(3, 2),
                new Q8_6.Step(1, 3),
                new Q8_6.Step(2, 1),
                new Q8_6.Step(2, 3),
                new Q8_6.Step(1, 3)
        }, rc.toArray(new Q8_6.Step[0]));
    }
}