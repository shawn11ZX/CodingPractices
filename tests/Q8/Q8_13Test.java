package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_13Test {
    @Test
    public void test() {
        {
            ArrayList<Q8_13.Box> boxes = new ArrayList<>();

            int real = Q8_13.maxHeight(boxes.toArray(new Q8_13.Box[0]));
            int expect = Q8_13.createStack(boxes);
            Assert.assertEquals(expect, real);
        }
        {
            ArrayList<Q8_13.Box> boxes = new ArrayList<>();
            boxes.add(new Q8_13.Box(30, 40, 1));
            int real = Q8_13.maxHeight(boxes.toArray(new Q8_13.Box[0]));
            int expect = Q8_13.createStack(boxes);
            Assert.assertEquals(expect, real);
        }

        {
            ArrayList<Q8_13.Box> boxes = new ArrayList<>();
            boxes.add(new Q8_13.Box(30, 40, 1));
            boxes.add(new Q8_13.Box(3, 4, 1));
            boxes.add(new Q8_13.Box(5, 7, 8));
            boxes.add(new Q8_13.Box(3, 2, 9));
            boxes.add(new Q8_13.Box(20, 1, 30));
            boxes.add(new Q8_13.Box(20, 33, 30));
            int real = Q8_13.maxHeight(boxes.toArray(new Q8_13.Box[0]));
            int expect = Q8_13.createStack(boxes);
            Assert.assertEquals(expect, real);
        }
    }
}