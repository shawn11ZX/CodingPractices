package Q8;

import java.util.*;

public class Q8_13 {
    public static class Box implements Comparator<Box>, Comparable {
        public Box(int height, int width, int depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
        }

        public int height;
        public int width;
        public int depth;


        @Override
        public int compare(Box o1, Box o2) {
            return o2.height - o1.height;
        }

        public boolean canBeAbove(Box bottom) {
            return bottom.height > height && bottom.width > width && bottom.depth > depth;
        }

        @Override
        public int compareTo(Object o) {
            return ((Box)o).height - height;
        }
    }

    public static int maxHeight(Box[] boxSet) {
        Arrays.sort(boxSet);
        return maxHeight(boxSet, -1, new HashMap<>());
    }

    public static int maxHeight(Box[] boxSet, int prevIndex, HashMap<Integer, Integer> history) {
        if (history.containsKey(prevIndex))
            return history.get(prevIndex);
        if (prevIndex >= boxSet.length)
            return 0;
        else {
            int maxHeight = 0;
            for (int i = prevIndex + 1; i < boxSet.length; i++) {
                if (prevIndex == -1 || boxSet[i].canBeAbove(boxSet[prevIndex])) {
                    int h = maxHeight(boxSet, i, history);
                    maxHeight = Math.max(maxHeight, h + boxSet[i].height);
                }
            }
            history.put(prevIndex, maxHeight);
            return maxHeight;
        }
    }

    public static int createStack(ArrayList<Box> boxes) {
        /* Sort in decending order by height. */
        Collections.sort(boxes, new BoxComparator());
        int maxHeight = 0;
        for (int i = 0; i < boxes.size(); i++) {
            int height = createStack(boxes, i);
            maxHeight = Math.max(maxHeight, height);
        }
        return maxHeight;
    }

    public static int createStack(ArrayList<Box> boxes, int bottomlndex) {
        Box bottom = boxes.get(bottomlndex);
        int maxHeight = 0;
        for (int i = bottomlndex + 1; i < boxes.size(); i++) {
            if (boxes.get(i).canBeAbove(bottom)) {
                int height = createStack(boxes, i);
                maxHeight = Math.max(height, maxHeight);
            }
        }
        maxHeight += bottom.height;
        return maxHeight;
    }

    public static class BoxComparator implements Comparator<Box> {
        @Override
        public int compare(Box x, Box y) {
            return y.height - x.height;
        }
    }
}
