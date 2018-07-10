package Q2;

import org.junit.Assert;
import org.junit.Test;

import static Q2.Q2_1.removeDups;
import static Q2.Q2_1.removeDups2;
import static org.junit.Assert.*;
import Q2.Q2_1.*;
public class Q2_1Test {
    @Test
    public void testRemoveDups() {
        {
            Node real = null;
            real = removeDups(real);

            Node expect = null;
            ListTestUtils.assertEquals(expect, real);
        }
        {
            Node real = new Node(1);
            real = removeDups(real);

            Node expect = new Node(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            Node real = new Node(1, new Node(1));
            real = removeDups(real);

            Node expect = new Node(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            Node real = new Node(1, new Node(2, new Node(1)));
            real = removeDups(real);

            Node expect = new Node(1, new Node(2));
            ListTestUtils.assertEquals(expect, real);
        }
    }

    @Test
    public void testRemoveDups2() {

        {
            Node real = null;
            real = removeDups2(real);

            Node expect = null;
            ListTestUtils.assertEquals(expect, real);
        }
        {
            Node real = new Node(1);
            real = removeDups2(real);

            Node expect = new Node(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            Node real = new Node(1, new Node(1));
            real = removeDups2(real);

            Node expect = new Node(1);
            ListTestUtils.assertEquals(expect, real);
        }

        {
            Node real = new Node(1, new Node(2, new Node(1)));
            real = removeDups2(real);

            Node expect = new Node(2, new Node(1));
            ListTestUtils.assertEquals(expect, real);
        }
    }
}