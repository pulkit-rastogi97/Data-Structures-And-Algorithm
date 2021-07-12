
public class HeightOfGenericTree {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		int height = height(root);
		System.out.println(height);
	}

	private static int height(Node root) {
		int height = -1;
		for(Node child : root.children) {
			height = Math.max(height, height(child));
		}
		return height + 1;
	}
}
