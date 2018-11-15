package Q8;

import org.omg.PortableServer.POA;

import java.util.HashMap;
import java.util.LinkedList;

public class Q8_10 {


    public static enum Color
    {
        White, Black
    }
    public static void fillColor(int x, int y, Color[][] image, Color oldColor, Color newColor) {
        if (x < 0 || y < 0 || x >= image[0].length || y >= image.length)
            return;
        if (image[x][y] == oldColor) {
            image[x][y] = newColor;
            fillColor(x - 1, y, image, oldColor, newColor);
            fillColor(x + 1, y, image, oldColor, newColor);
            fillColor(x, y - 1, image, oldColor, newColor);
            fillColor(x, y + 1, image, oldColor, newColor);
        }

    }
}
