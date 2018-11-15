package Q8;

import org.omg.PortableServer.POA;

import java.util.HashMap;
import java.util.LinkedList;

public class Q8_10 {
    public static class Point
    {
        int x;
        int y;
    }

    public static class Image
    {
        int width;
        int height;


        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }

        public Color getColor(Point start) {
            return null;
        }

        public void setColor(Point p, Color color) {
        }

        public LinkedList<Point> getNeighbors(Point p) {
            return null;
        }
    }

    public static class Color
    {
    }
    public static void fillColor(Point start, Image image, Color color)
    {
        HashMap visited = new HashMap();
        LinkedList<Point> todo = new LinkedList();
        todo.add(start);
        Color oldColor = image.getColor(start);
        while(!todo.isEmpty())
        {
            Point p = todo.removeLast();
            image.setColor(p, color);
            visited.put(p, true);
            LinkedList<Point> l = image.getNeighbors(p);
            for(Point n : l) {
                Color nc = image.getColor(n);
                if (nc.equals(oldColor) && !visited.containsKey(nc))
                    todo.add(p);
            }
        }
    }
}
