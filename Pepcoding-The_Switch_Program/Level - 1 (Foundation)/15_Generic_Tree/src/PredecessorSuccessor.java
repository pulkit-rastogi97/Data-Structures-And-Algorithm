import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PredecessorSuccessor {

	static Node predecessor;
	static Node successor;
	static int state = 0;
	public static void predecessorAndSuccessor(Node node, int data) {
		if(state == 0) {
			if(data == node.data)
				state++;
			else
				predecessor = node;
		}else if(state == 1) {
			successor = node;
			state++;
			
			//to not go in for loop below
			return;
		}
		
		for(Node child : node.children) {
			if(state < 2)
				predecessorAndSuccessor(child, data);
			else
				return;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(values[i]);
		}

		int data = Integer.parseInt(br.readLine());

		Node root = GTHelper.construct(arr);
		predecessor = null;
		successor = null;
		predecessorAndSuccessor(root, data);
		if (predecessor == null) {
			System.out.println("Predecessor = Not found");
		} else {
			System.out.println("Predecessor = " + predecessor.data);
		}

		if (successor == null) {
			System.out.println("Successor = Not found");
		} else {
			System.out.println("Successor = " + successor.data);
		}
	}
}
