import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LinearizeInGenericTree {

	private static void linearize(Node node) {
		// Ask my childs to get linearize
		for (Node child : node.children) {
			linearize(child);
		}

		// Manage head & tails
		for (int i = node.children.size() - 2; i >= 0; i--) {
			Node last = node.children.remove(i + 1);
			Node sLast = node.children.get(i);

			Node sLastTail = getTail(sLast);
			sLastTail.children.add(last);
		}
	}

	private static Node getTail(Node node) {
		Node tail = node;
		
		while(tail.children.size() != 0) {
			tail = tail.children.get(0);
		}
		
		return tail;
	}
	
	private static Node linearizeOptimized(Node node) {
		if(node.children.size() == 0)
			return node;
		
		Node lastTail = linearizeOptimized(node.children.get(node.children.size() - 1));
		
		while(node.children.size() > 1) {
			Node last = node.children.remove(node.children.size() - 1);
			Node sLastTail = linearizeOptimized(node.children.get(node.children.size() - 1));
			sLastTail.children.add(last);
		}

		return lastTail;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(values[i]);
		}

		Node root = GTHelper.construct(arr);
		linearize(root);
		System.out.println("Non optimized :: ");
		GTHelper.display(root);
		root = GTHelper.construct(arr);
		linearizeOptimized(root);
		System.out.println();
		System.out.println("Optimized :: ");
		GTHelper.display(root);


	}
}
