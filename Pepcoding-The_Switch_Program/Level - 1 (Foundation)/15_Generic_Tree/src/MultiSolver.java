
public class MultiSolver {
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Multi Solver 1~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//1st way to solve using global variable
	static int min = Integer.MAX_VALUE;
	static int max = Integer.MIN_VALUE;
	static int height = -1;
	static int size = 0 ;
	
	private static void multiSolver1(Node node, int depth) {
		if(min > node.data)
			min = node.data;
		
		if(max < node.data)
			max = node.data;
		
		height = Math.max(depth, height);
		size++;
		
		for(Node child : node.children) {
			multiSolver1(child, depth + 1);
		}
	}
	
	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Multi Solver 2~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//2nd way -> Return Type
	public static class MultiPair{
		int min;
		int max;
		int height;
		int size;
		
		MultiPair(int min, int max, int height, int size){
			this.min = min;
			this.max = max;
			this.height = height;
			this.size = size;
		}
		
		public MultiPair() {
			this.min = Integer.MAX_VALUE;
			this.max = Integer.MIN_VALUE;
			this.height = -1;
			this.size = 0;
		}
	}
	
	public static MultiPair multiSolver2(Node node) {
		MultiPair myRes = new MultiPair(node.data, node.data, -1, 1);
		
		for(Node child : node.children) {
			MultiPair rres  = multiSolver2(child);
			myRes.size += rres.size;
			myRes.height = Math.max(rres.height, myRes.height);
			myRes.min = Math.min(rres.min, myRes.min);
			myRes.max = Math.max(rres.max, myRes.max);
		}
		
		myRes.height += 1;  //My contribution
		return myRes;
	}
	
	
	public static void main(String[] args) {
		Node root = GTHelper.getDefaultTree();
		multiSolver1(root, 0);
		System.out.println("~~~~~~~~~~Multi Solver 1~~~~~~~~~~~~~~~~~");
		System.out.println("Max : " + max);
		System.out.println("Min : " + min);
		System.out.println("Height : " + height);
		System.out.println("Size : " + size);
		
		System.out.println("~~~~~~~~~~Multi Solver 2~~~~~~~~~~~~~~~~~");
		MultiPair multiSolver = multiSolver2(root);
		System.out.println("Max : " + multiSolver.max);
		System.out.println("Min : " + multiSolver.min);
		System.out.println("Height : " + multiSolver.height);
		System.out.println("Size : " + multiSolver.size);
	}

}
