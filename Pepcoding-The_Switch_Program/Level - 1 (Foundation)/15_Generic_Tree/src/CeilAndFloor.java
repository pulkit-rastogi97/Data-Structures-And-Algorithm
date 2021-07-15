import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CeilAndFloor {

	static int ceil = Integer.MAX_VALUE;
	static int floor = Integer.MIN_VALUE;

	public static void ceilAndFloor(Node node, int data) {
		if(ceil > node.data)
			if(data < node.data)
				ceil = node.data;
		
		if(floor < node.data)
			if(data > node.data)
				floor = node.data;
		
		for(Node child : node.children) {
			ceilAndFloor(child, data);
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
		ceil = Integer.MAX_VALUE;
		floor = Integer.MIN_VALUE;
		ceilAndFloor(root, data);
		System.out.println("CEIL = " + ceil);
		System.out.println("FLOOR = " + floor);
	}

}
