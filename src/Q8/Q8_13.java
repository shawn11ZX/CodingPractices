package Q8;

import java.util.Set;

public class Q8_13 {
    public static class Box {
        public int height;
        public int width;
        public int depth;
    }
    public static int maxHeight(Set<Box> boxSet, Box lastBox)
    {
        int maxHeight = 0;
        for(Box box :boxSet)
        {
            if (box.depth > lastBox.depth && box.width > lastBox.width && box.height > lastBox.height)
            {
                boxSet.remove(box);
                int h = maxHeight(boxSet, box);
                maxHeight = Math.max(maxHeight, h+box.height);
            }
        }
        return maxHeight;
    }
}
