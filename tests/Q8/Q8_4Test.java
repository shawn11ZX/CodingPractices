package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class Q8_4Test {
    @Test
    public void testEmpty() {
        LinkedList<LinkedList> rc = Q8_4.subSets(new LinkedList());
        Assert.assertTrue(rc.size() == 1);
        Assert.assertTrue(rc.get(0).size() == 0);
    }

    @Test
    public void testOne() {
        LinkedList set = new LinkedList();
        set.add(1);

        LinkedList<LinkedList> rc = Q8_4.subSets(set);
        Assert.assertTrue(rc.size() == 2);
        Assert.assertTrue(rc.get(0).size() == 0);
        Assert.assertTrue(rc.get(1).size() == 1);
    }

    @Test
    public void testThree() {
        LinkedList set = new LinkedList();
        set.addFirst(3);
        set.addFirst(2);
        set.addFirst(1);



        LinkedList<LinkedList> rc = Q8_4.subSets(set);
        Assert.assertTrue(rc.size() == 8);
        Assert.assertArrayEquals(new Integer[0], rc.get(0).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{3}, rc.get(1).toArray(new Integer[0]));

        Assert.assertArrayEquals(new Integer[]{2}, rc.get(2).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{2,3}, rc.get(3).toArray(new Integer[0]));


        Assert.assertArrayEquals(new Integer[]{1}, rc.get(4).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{1, 3}, rc.get(5).toArray(new Integer[0]));

        Assert.assertArrayEquals(new Integer[]{1, 2}, rc.get(6).toArray(new Integer[0]));
        Assert.assertArrayEquals(new Integer[]{1, 2,3}, rc.get(7).toArray(new Integer[0]));

    }
}