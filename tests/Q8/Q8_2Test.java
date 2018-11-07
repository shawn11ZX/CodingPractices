package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class Q8_2Test {

    @Test
    public void testFindPath() {
        Q8_2.Matrix m = new Q8_2.Matrix(1, 1);
        LinkedList<Q8_2.Cell> rc = new LinkedList<>();
        boolean found = Q8_2.findPath(m, 1, 1, rc);
        Assert.assertTrue(found);
    }

    @Test
    public void testFindPath2() {
        Q8_2.Matrix m = new Q8_2.Matrix(2, 2);
        m.setCell(1, 2, Q8_2.CellType.Blocked);
        LinkedList<Q8_2.Cell> rc = new LinkedList<>();
        boolean found = Q8_2.findPath(m, 1, 1, rc);
        Assert.assertTrue(found);
        Assert.assertArrayEquals(new Q8_2.Cell[] {
                new Q8_2.Cell(1, 1),
                new Q8_2.Cell(2, 1),
                new Q8_2.Cell(2, 2),
        }, rc.toArray(new Q8_2.Cell[0]));
    }
}