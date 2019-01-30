import java.util.ArrayList;
import java.util.List;

public class Node {

    public List<Node> children;
    public String label;

    public Node(String label, List<Node> children) {
        this.label = label;
        this.children = children;
    }

    public Node(String label) {
        this.label = label;
        this.children = new ArrayList<Node>();
    }
}
