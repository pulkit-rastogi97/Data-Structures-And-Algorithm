import java.io.BufferedReader;
import java.io.InputStreamReader;

public class RemoveLeaves {

	public static void removeLeaves(Node node) {
		
		//I will remove my leaves
		for(int i = node.children.size() - 1; i >= 0; i--) {
			Node child = node.children.get(i);
			if(isChildLeafNode(child) == true) {
				node.children.remove(i);
			}
		}
		
		//Ask my child to remove their leaves
		for(Node child : node.children) {
			removeLeaves(child);
		}
	}

	private static boolean isChildLeafNode(Node child) {
		if(child.children.size() == 0)
			return true;
		return false;
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
		removeLeaves(root);
		GTHelper.display(root);
	}
}
