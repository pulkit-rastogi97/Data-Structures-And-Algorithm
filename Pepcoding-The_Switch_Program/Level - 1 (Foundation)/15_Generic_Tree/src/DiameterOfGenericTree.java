import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DiameterOfGenericTree {

	static int diameter = 0;
	public static int heightForDiameter(Node node) {
		int height = -1;
		int mH = -1;
		int sMH = -1;
		
		for(Node child : node.children) {
			int childHeight = heightForDiameter(child);
			if(childHeight >= mH) {
				sMH = mH;
				mH = childHeight;
			}else if(childHeight > sMH){
				sMH = childHeight;
			}
			
			//updateHeight
			height = Math.max(childHeight, height);
		}
		
		diameter = Math.max(diameter, sMH + mH + 2);
		
		return height + 1;   // or just do maxHeight + 1
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
		heightForDiameter(root);
		System.out.println(diameter);
	}
}
