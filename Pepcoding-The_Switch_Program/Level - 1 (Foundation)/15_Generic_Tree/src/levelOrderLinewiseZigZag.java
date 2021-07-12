import java.util.Stack;

public class levelOrderLinewiseZigZag {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		levelOrderLinewiseZZ(root);
	}

	private static void levelOrderLinewiseZZ(Node root) {
		if(root == null)
			return;
		Stack<Node> mS = new Stack<Node>();
		Stack<Node> cS = new Stack<Node>();
		mS.add(root);
		int level = 1;
		
		while(mS.size() > 0) {
			int count = mS.size();
			for(int i = 0; i < count; i++) {
				Node remove = mS.pop();
				
				System.out.print(remove.data + " ");
				
				if(level%2 == 0) {
					for(int j = remove.children.size() - 1; j >= 0; j--) {
						cS.push(remove.children.get(j));
					}
				}else {
					
					for(Node child : remove.children) {
						cS.push(child);
					}
				}
			}
			
			if(mS.size() == 0 && cS.size() != 0) {
				level++;
				System.out.println();
				mS = cS;
				cS = new Stack<Node>();
			}

			
		}
		
	}
}
