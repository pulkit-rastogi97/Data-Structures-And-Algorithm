
public class MaximumInGenericTree {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		int max = getMaximum(root);
		System.out.println(max);
	}

	private static int getMaximum(Node root) {
		int max = Integer.MIN_VALUE;
		for(Node child : root.children) {
			max = Math.max(max, getMaximum(child));
		}
		return Math.max(max, root.data);
	}
}
