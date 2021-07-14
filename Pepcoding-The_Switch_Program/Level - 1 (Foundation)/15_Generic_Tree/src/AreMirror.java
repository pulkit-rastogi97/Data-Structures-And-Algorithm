import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AreMirror {

	public static boolean areMirror(Node n1, Node n2) {
		
		if(n1.children.size() != n2.children.size())
			return false;
		
		boolean areMirror = true;
		for(int i = 0, j = n2.children.size() - 1; i < n1.children.size() && j >= 0; i++, j--) {
			areMirror = areMirror(n1.children.get(i), n2.children.get(j));
			if(areMirror == false)
				return areMirror;
		}
		return areMirror;
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n1 = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n1];
		String[] values1 = br.readLine().split(" ");
		for (int i = 0; i < n1; i++) {
			arr1[i] = Integer.parseInt(values1[i]);
		}
		Node root1 = GTHelper.construct(arr1);

		int n2 = Integer.parseInt(br.readLine());
		int[] arr2 = new int[n2];
		String[] values2 = br.readLine().split(" ");
		for (int i = 0; i < n2; i++) {
			arr2[i] = Integer.parseInt(values2[i]);
		}
		Node root2 = GTHelper.construct(arr2);

		boolean mirror = areMirror(root1, root2);
		System.out.println(mirror);
	}
}
