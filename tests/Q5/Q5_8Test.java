package Q5;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Q5_8Test {

    @Test
    public void drawPoint() {
        byte[] screen1 = new byte[64];
        byte[] screen2 = new byte[64];
        int width = 64;
        int x1 = 3;
        int x2 = 47;
        int y = 1;
        Q5_8.drawLine(screen1, width, x1, x2, y);
        Q5_8.drawLine2(screen2, width, x1, x2, y);

        Assert.assertArrayEquals(screen1, screen2);
    }
}