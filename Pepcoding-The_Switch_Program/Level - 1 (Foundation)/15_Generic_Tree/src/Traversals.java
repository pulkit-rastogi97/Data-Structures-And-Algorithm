
public class Traversals {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		traversals(root);
	}
	
	
//	2.1. When the control reaches the node for the first time -> "Node Pre" node.data
//	2.2. Before the control leaves for a child node from a node -> "Edge Pre" node.data--child.data
//	2.3. After the control comes back to a node from a child -> "Edge Post" node.data--child.data
//	2.4. When the control is about to leave node, after the children have been visited -> "Node Post" node.data

	private static void traversals(Node root) {
		System.out.println("Node Pre " + root.data);
		for(Node child : root.children) {
			System.out.println("Edge Pre " + root.data + "--" + child.data);
			traversals(child);
			System.out.println("Edge Post " + root.data + "--" + child.data);
		}
		System.out.println("Node Post " + root.data);
	}
}
