import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FindInGenericTree {

	public static boolean find(Node node, int data) {
		//I will check my data 
		if(node.data == data)
			return true;
		
		boolean isFound = false;
		for(Node child : node.children) {
			isFound = find(child, data);
			if(isFound == true)
				return isFound;
		}
		return isFound;
			
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
		boolean flag = find(root, data);
		System.out.println(flag);
		// display(root);
	}
}
