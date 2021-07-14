import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class NodeToRootPath {

	public static ArrayList<Integer> nodeToRootPath(Node node, int data) {
		if(node.data == data) {
			ArrayList<Integer> bres = new ArrayList<Integer>();
			bres.add(node.data);
			return bres;
		}
		
		for(Node child : node.children) {
			ArrayList<Integer> rres = nodeToRootPath(child, data);
			if(rres.size() > 0) {
				rres.add(node.data);
				return rres;
			}
		}
		
		return new ArrayList<Integer>();
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
		ArrayList<Integer> path = nodeToRootPath(root, data);
		System.out.println(path);
		// display(root);
	}
}
