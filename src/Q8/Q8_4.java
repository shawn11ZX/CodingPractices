package Q8;

import java.util.LinkedList;

public class Q8_4 {
    public static LinkedList<LinkedList> subSets(LinkedList s)
    {
        LinkedList<LinkedList> rc = new LinkedList();
        if (s.isEmpty())
        {
            rc.add(new LinkedList<>());
            return rc;
        }
        else {
            Object e = s.removeFirst();
            LinkedList<LinkedList> sub = subSets(s);
            rc.addAll(sub);
            for(LinkedList set: sub)
            {
                LinkedList copy = (LinkedList )set.clone();
                copy.addFirst(e);
                rc.add(copy);
            }
            return rc;
        }
    }
}
