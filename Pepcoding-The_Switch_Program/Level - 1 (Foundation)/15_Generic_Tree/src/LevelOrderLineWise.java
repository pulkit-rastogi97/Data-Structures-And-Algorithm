import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderLineWise {

	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		levelOrderLinewise3(root);
	}

	// Using 2 queues --> mainQueue && childQueue
	@SuppressWarnings("unused")
	private static void levelOrderLinewise1(Node root) {
		if (root == null)
			return;
		Queue<Node> mq = new ArrayDeque<Node>();
		Queue<Node> cq = new ArrayDeque<Node>();

		mq.add(root);

		while (mq.size() > 0) {
			// 1. Remove
			Node remove = mq.remove();

			// 2. Print
			System.out.print(remove.data + " ");

			// 3. Add children
			for (Node child : remove.children) {
				cq.add(child);
			}

			// If size of mainQueue is Zero
			if (mq.size() == 0 && cq.size() != 0) {
				System.out.println();
				mq = cq;
				cq = new ArrayDeque<Node>();
			}
		}
	}

	// Using delimeter as null, so have to use linkedlist as queue doesn't allow
	// null
	@SuppressWarnings("unused")
	private static void levelOrderLinewise2(Node root) {
		if (root == null)
			return;
		Queue<Node> mq = new LinkedList<Node>();
		mq.add(root);
		mq.add(null);

		while (mq.size() > 0) {
			// 1. Remove
			Node remove = mq.remove();

			if (remove != null) {
				// 2. Print
				System.out.print(remove.data + " ");

				// 3. Add children
				for (Node child : remove.children) {
					mq.add(child);
				}
			} else {
				if (mq.size() > 0) {
					mq.add(null);
					System.out.println();
				}
			}

		}

	}
	
	//Using variable to change levels
	private static void levelOrderLinewise3(Node root) {
		if(root == null)
			return;
		Queue<Node> mq = new ArrayDeque<Node>();
		mq.add(root);
		
		while(mq.size() > 0) {
			int countOfChildForLevel = mq.size();
			
			for(int i = 0; i < countOfChildForLevel; i++) {
				Node remove = mq.remove();
				
				System.out.print(remove.data + " ");
				
				for(Node child : remove.children) {
					mq.add(child);
				}
			}
			
			System.out.println();
		}
		
	}

	

}
