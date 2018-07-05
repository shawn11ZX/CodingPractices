package Q1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;
import Q1.Q1_7.Matrix;
import Q1.Q1_7.*;
public class Q1_7Test {

    @Test
    public void rotate() {
        {
            Matrix m = new Matrix(new int[]{1}, 1);
            Q1_7.rotate(m);
            Assert.assertArrayEquals(m.getData(), new int[]{1});
        }
        {
            Matrix m = new Matrix(new int[]{1, 2, 3, 4}, 2);
            Q1_7.rotate(m);
            Assert.assertArrayEquals(m.getData(), new int[]{2, 4, 1, 3});
        }

        {
            Matrix m = new Matrix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, 3);
            Q1_7.rotate(m);
            Assert.assertArrayEquals(m.getData(), new int[]{3, 6, 9, 2, 5, 8, 1, 4, 7});
        }
    }
}