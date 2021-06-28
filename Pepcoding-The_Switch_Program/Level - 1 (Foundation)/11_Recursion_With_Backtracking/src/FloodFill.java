
public class FloodFill {

	static int[][] dir = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
	static String[] dirS = {"t", "l", "d", "r"};
	
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int m = Helper.inputInt();
		int[][] maze = Helper.inputArr(n, m);
		
		floodfill(maze, 0, 0, "");
	}
	
    private static void floodfill(int[][] maze, int sr, int sc, String asf) {
    	if(sr == maze.length - 1 && sc == maze[0].length - 1) {
    		System.out.println(asf);
    		return;
    	}
    	
    	//mark when visit
    	maze[sr][sc] = 1;
    	
    	for(int d = 0; d < dir.length; d++) {
    		int row = sr + dir[d][0];
    		int col = sc + dir[d][1];
    		
    		if(row >= 0 && col >= 0 && row <= maze.length - 1 && col <= maze[0].length - 1) {
    			//path not blocked
    			if(maze[row][col] != 1) {
    				floodfill(maze, row, col, asf + dirS[d]);
    			}
    		}
    	}
    	
    	//unmark after visiting
    	maze[sr][sc] = 0;
    }

}
