import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Node {
    public int val;
    public List<Node> neighbors;
}

public class clone {
    public static void main(String[] args) {
        // HashMap<Node, Node> map = new HashMap<>();
    }

    public Node cloneGraph(Node node, HashMap<Node, Node> map) {
        if (node == null) {
            return null;
        }
        if (map.containsKey(node)) {
            return map.get(node);
        }

        // new clone
        Node clone = new Node();
        clone.val = node.val;
        clone.neighbors = new ArrayList<>();

        // store in the map
        map.put(node, clone);
        for (Node i : node.neighbors) {
            Node clonedNeighbor = cloneGraph(i, map);
            clone.neighbors.add(clonedNeighbor);
        }
        return clone;

    }
}