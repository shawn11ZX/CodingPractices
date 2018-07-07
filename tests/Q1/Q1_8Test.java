package Q1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q1_8Test {

    @Test
    public void zeroMatrix() {
        {
            Q1_8.Matrix m = new Q1_8.Matrix(new int[]{
                    0
            }, 1, 1);
            Q1_8.zeroMatrix(m);
            Assert.assertArrayEquals(m.getData(), new int[] {0});
        }

        {
            Q1_8.Matrix m = new Q1_8.Matrix(new int[]{
                    1
            }, 1, 1);
            Q1_8.zeroMatrix(m);
            Assert.assertArrayEquals(m.getData(), new int[] {1});
        }

        {
            Q1_8.Matrix m = new Q1_8.Matrix(new int[]{
                    1, 0, 1,
                    1, 1, 1
            }, 2, 3);
            Q1_8.zeroMatrix(m);
            Assert.assertArrayEquals(m.getData(), new int[] {
                    0, 0, 0,
                    1, 0, 1
            });
        }
    }
}