import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class LowestCommonAncestor {

	public static int lca(Node node, int d1, int d2) {
		ArrayList<Integer> n2rp1 = NodeToRootPath.nodeToRootPath(node, d1);
		ArrayList<Integer> n2rp2 = NodeToRootPath.nodeToRootPath(node, d2);
		
		int i = n2rp1.size() - 1;
		int j = n2rp2.size() - 1;
		int result = -1;
		while(i >= 0 && j >= 0 && n2rp1.get(i) == n2rp2.get(j)) {
			result = n2rp1.get(i);
			i--;
			j--;
		}
		return result;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		String[] values = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(values[i]);
		}

		int d1 = Integer.parseInt(br.readLine());
		int d2 = Integer.parseInt(br.readLine());

		Node root = GTHelper.construct(arr);
		int lca = lca(root, d1, d2);
		System.out.println(lca);
		// display(root);
	}
}
