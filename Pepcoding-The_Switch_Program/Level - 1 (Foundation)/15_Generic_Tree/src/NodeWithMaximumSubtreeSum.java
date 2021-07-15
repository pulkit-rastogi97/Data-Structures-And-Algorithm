import java.io.BufferedReader;
import java.io.InputStreamReader;

public class NodeWithMaximumSubtreeSum {
	static int nodeData = 0;
	static int maxSum = 0;
	public static int maximumSubtreeSum(Node node) {
		int sum = node.data;
		for(Node child : node.children) {
			sum += maximumSubtreeSum(child);
		}
		
		if(sum > maxSum) {
			maxSum = sum;
			nodeData = node.data;
		}
		return sum;
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
		maximumSubtreeSum(root);
		System.out.println(nodeData + "@" + maxSum);
	}
}
