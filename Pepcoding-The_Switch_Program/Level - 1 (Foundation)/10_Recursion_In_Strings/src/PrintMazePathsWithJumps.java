
public class PrintMazePathsWithJumps {
	

 	static int[][] dir = {{0, 1}, {1, 0}, {1, 1}};
	static String[] dirS = {"h", "v", "d"};
    public static void main(String[] args) throws Exception {
    	int n = Helper.inputInt();
    	int m = Helper.inputInt();
    	printMazePathsWithJumps(0, 0, n - 1, m - 1, "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePathsWithJumps(int sr, int sc, int dr, int dc, String psf) {
        if(sr == dr && sc == dc) {
        	System.out.println(psf);
        	return;
        }
    	
    	for(int d = 0; d < dir.length; d++) {
    		for(int rad = 1; rad <= Math.max(dr,  dc); rad++) {
	    		int row = sr + rad * dir[d][0];
	    		int col = sc + rad * dir[d][1];
	    		
	    		if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
	    			printMazePathsWithJumps(row, col, dr, dc, psf + dirS[d] + rad);
	    		}else
	    			break;
	    	}
    	}
    }
    
}
