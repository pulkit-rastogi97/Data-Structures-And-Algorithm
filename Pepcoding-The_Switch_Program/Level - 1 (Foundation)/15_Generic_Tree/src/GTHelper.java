import java.util.ArrayList;
import java.util.Stack;
class Node {
	int data;
	ArrayList<Node> children;

	public Node() {
		this.data = 0;
		this.children = new ArrayList<Node>();
	}

	public Node(Integer data) {
		this.data = data;
		this.children = new ArrayList<Node>();
	}

}
public class GTHelper {
	public static Node construct(Integer[] arr) {
		Node root = null;
		Stack<Node> st = new Stack<Node>();

		for (Integer x : arr) {
			if (!st.isEmpty()) {
				if (x != null) {
					Node node = new Node(x);
					st.peek().children.add(node);
					st.push(node);
				} else {
					st.pop();
				}
			} else {
				root = new Node(x);
				st.push(root);
			}
		}
		return root;
	}
	
	public static Node getDefaultTree() {
		Integer[] arr = {10, 20, 50, null, 60, null, null, 30, 70, null, 80, 110, null, 120, null, null, 90, null, null, 40, 100, null, null, null};
		return construct(arr);
	}
	
	public static void display(Node root) {
		String str = "[" + root.data + "] -> ";
		for(Node child : root.children) {
			str += child.data + ", ";
		}
		System.out.println(str + ".");
		
		for(Node child : root.children) {
			display(child);
		}
	}
	
}
