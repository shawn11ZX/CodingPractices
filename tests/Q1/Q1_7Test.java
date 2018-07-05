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

        {
            Matrix m = new Matrix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16}, 4);
            Q1_7.rotate(m);
            Assert.assertArrayEquals(m.getData(), new int[]{4, 8 , 12, 16, 3, 7, 11, 15, 2, 6 , 10, 14, 1, 5, 9, 13});
        }

        {
            Matrix m = new Matrix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,16, 17, 18, 19, 20, 21, 22, 23, 24, 25}, 5);
            Q1_7.rotate(m);
            Assert.assertArrayEquals(m.getData(), new int[]{
                    5, 10, 15, 20, 25,
                    4, 9, 14, 19, 24,
                    3, 8, 13, 18, 23,
                    2, 7, 12, 17, 22,
                    1, 6, 11, 16, 21});
        }
    }
}