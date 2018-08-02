package Q3;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;
import static Q3.Q3_5.*;
public class Q3_5Test {

    @Test
    public void testSort() {
        Stack<Integer> s = new Stack<>();
        sort(s);
        Assert.assertTrue(s.empty());
    }

    @Test
    public void testSort2() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        sort(s);
        Assert.assertEquals((Integer)1, s.pop());
        Assert.assertTrue(s.empty());
    }


    @Test
    public void testSort3() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        sort(s);
        Assert.assertEquals((Integer)1, s.pop());
        Assert.assertEquals((Integer)2, s.pop());
        Assert.assertEquals((Integer)3, s.pop());
        Assert.assertTrue(s.empty());
    }

    @Test
    public void testSort4() {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(1);
        s.push(2);

        sort(s);
        Assert.assertEquals((Integer)1, s.pop());
        Assert.assertEquals((Integer)2, s.pop());
        Assert.assertEquals((Integer)3, s.pop());
        Assert.assertTrue(s.empty());
    }

    @Test
    public void testSort5() {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        sort(s);
        Assert.assertEquals((Integer)1, s.pop());
        Assert.assertEquals((Integer)2, s.pop());
        Assert.assertEquals((Integer)3, s.pop());
        Assert.assertTrue(s.empty());
    }

    @Test
    public void testSort6() {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(3);
        s.push(1);
        sort(s);
        Assert.assertEquals((Integer)1, s.pop());
        Assert.assertEquals((Integer)2, s.pop());
        Assert.assertEquals((Integer)3, s.pop());
        Assert.assertTrue(s.empty());
    }
}