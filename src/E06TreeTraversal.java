import java.util.ArrayList;
import java.util.List;

public class E06TreeTraversal {

    public static void main(String[] args) {
        List<Node> nlist = new ArrayList<Node>();
        nlist.add(new Node("b"));
        Node n_a = new Node("a", nlist);
        nlist = new ArrayList<Node>();
        nlist.add(n_a);
        nlist.add(new Node("c"));
        nlist.add(new Node("d"));
        Node root = new Node("hello", nlist);

        System.out.println(postorder(root));
    }

    private static String postorder(Node n) {
        String labels_postorder = "";
        for (Node child : n.children) {
            labels_postorder += postorder(child);
        }
        labels_postorder += " " + n.label;
        return labels_postorder;
    }

}
