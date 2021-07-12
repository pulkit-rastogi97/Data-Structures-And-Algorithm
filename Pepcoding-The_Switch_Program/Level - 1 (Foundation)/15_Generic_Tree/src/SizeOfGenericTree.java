
public class SizeOfGenericTree {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		int size = getSize(root);
		System.out.println(size);
	}

	private static int getSize(Node root) {
		int size = 0;    
		for(Node child : root.children) {
			size += getSize(child); 
		}
		return size + 1; 
	}
}
