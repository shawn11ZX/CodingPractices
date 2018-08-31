package Q4;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class Q4_7Test {
    @Test
    public void test1() {
        Q4_7.DependencyGraph<Integer> dg = new Q4_7.DependencyGraph<>();
        dg.addDependency(1, 2);
        List<Integer> order = new ArrayList<>();
        Assert.assertTrue(dg.buildAll(order));
        Assert.assertArrayEquals(new Object[]{2, 1}, order.toArray());
    }

    @Test
    public void test2() {
        Q4_7.DependencyGraph<Integer> dg = new Q4_7.DependencyGraph<>();
        dg.addDependency(1, 2);
        dg.addDependency(2, 3);
        dg.addDependency(3, 4);
        dg.addDependency(3, 5);
        List<Integer> order = new ArrayList<>();
        Assert.assertTrue(dg.buildAll(order));
        Assert.assertArrayEquals(new Object[]{4, 5, 3, 2, 1}, order.toArray());
    }


    @Test
    public void testFail() {
        Q4_7.DependencyGraph<Integer> dg = new Q4_7.DependencyGraph<>();
        dg.addDependency(1, 2);
        dg.addDependency(2, 1);
        List<Integer> order = new ArrayList<>();
        Assert.assertFalse(dg.buildAll(order));
    }

    @Test
    public void testFail2() {
        Q4_7.DependencyGraph<Integer> dg = new Q4_7.DependencyGraph<>();
        dg.addDependency(1, 2);
        dg.addDependency(2, 3);
        dg.addDependency(3, 1);
        List<Integer> order = new ArrayList<>();
        Assert.assertFalse(dg.buildAll(order));
    }

}