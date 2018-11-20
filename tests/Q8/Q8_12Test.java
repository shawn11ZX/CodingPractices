package Q8;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class Q8_12Test {
    @Test
    public void test() {
        int count = Q8_12.permQueen(0, new int[8]);
        ArrayList<Integer[]> rt = new ArrayList<Integer[]>();
        Q8_12.placeQueens(0, new Integer[8], rt);
        Assert.assertEquals(count, rt.size());
    }
}