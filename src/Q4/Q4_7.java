package Q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q4_7 {
    public static class DependencyGraph<T>  {
        HashMap<T, Node> nodes = new HashMap<>();
        class Node {
            T k;
            boolean built;
            boolean building;
            List<Node> deps = new ArrayList<>();
            void addDep(Node n) {
                if (deps.indexOf(n) == -1)
                    deps.add(n);
            }
        }

        public boolean build(Node n, List<T> order) {
            if (n.built)
                return true;

            if (n.building)
                return false;

            n.building = true;
            for(Node c: n.deps) {
                if (!c.built) {
                    if (!build(c, order)) {
                        return false;
                    }
                }
            }
            order.add(n.k);
            n.built = true;
            n.building = false;
            return true;
        }
        public boolean buildAll(List<T> order) {
            for(Node n : nodes.values()) {
                if (!build(n, order))
                    return false;
            }
            return true;
        }

        public void clean() {
            for(Node n: nodes.values())
            {
                n.built = false;
                n.building = false;
            }
        }
        public Node findOrCreate(T k) {
            if (!nodes.containsKey(k))
            {
                Node n = new Node();
                n.k = k;
                nodes.put(k, n);
                return  n;
            }
            else
                return nodes.get(k);

        }
        public void addDependency(T from, T to) {
            Node fromN = findOrCreate(from);
            Node toN = findOrCreate(to);
            fromN.addDep(toN);
        }
    }
}
