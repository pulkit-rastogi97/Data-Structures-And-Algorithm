import java.util.ArrayDeque;
import java.util.Queue;

public class LevelOrderOfGenericTree {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		levelOrder(root);
	}

	private static void levelOrder(Node root) {
		if(root == null) {
			System.out.println(".");
			return;
		}
		Queue<Node> queue = new ArrayDeque<Node>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			
			//1. Get + Remove
			Node remove = queue.remove();
			
			//2. Print
			System.out.print(remove.data + " ");
			
			//3. Add children to queue
			for(Node child : remove.children) {
				queue.add(child);
			}
		}
		
		System.out.println(".");
	}
}
