import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IsGenericTreeSymmetric {

	//Tree should be mirror of itself, then only it can symmetric
	  public static boolean IsSymmetric(Node node) {
		  boolean res = AreMirror.areMirror(node, node);
		  return res;
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
	    boolean sym = IsSymmetric(root);
	    System.out.println(sym);
	  }
}
