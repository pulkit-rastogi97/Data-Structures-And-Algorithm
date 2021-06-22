import java.util.ArrayList;

public class GetMazePaths {	
	
    public static void main(String[] args) throws Exception {
    	int n = Helper.inputInt();
    	int m = Helper.inputInt();
    	ArrayList<String> mazePaths = getMazePaths(0, 0, n - 1, m - 1);
    	System.out.println(mazePaths);
    	
    	ArrayList<String> genericApproach = getMazePathsGeneric(0, 0, n - 1, m - 1, dir, dirS);
    	System.out.println(genericApproach);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
    	if(sr == dr && sc == dc) {
    		ArrayList<String> baseResult = new ArrayList<>();
    		baseResult.add("");
    		return baseResult;
    	}
    	
    	
    	ArrayList<String> myRes = new ArrayList<String>();
    	
    	if(sc + 1 <= dc) {
    		ArrayList<String> horizontalPaths = getMazePaths(sr, sc + 1, dr, dc);
    		for(String s : horizontalPaths) {
    			myRes.add("h" + s);
    		}
    	}
    	
    	if(sr + 1 <= dr) {
    		ArrayList<String> verticalPaths = getMazePaths(sr + 1, sc, dr, dc);
    		for(String s : verticalPaths) {
    			myRes.add("v" + s);
    		}
    	}
    	
        return myRes;
    }
    
	static int[][] dir = {{0,1}, {1, 0}};
	static String[] dirS = {"h", "v"};
    
    public static ArrayList<String> getMazePathsGeneric(int sr, int sc, int dr, int dc, int[][] dir, String[] dirS) {
    	if(sr == dr && sc == dc) {
    		ArrayList<String> baseResult = new ArrayList<>();
    		baseResult.add("");
    		return baseResult;
    	}
    	
    	ArrayList<String> myRes = new ArrayList<String>();
    	
    	for(int d = 0; d < dir.length; d++) {
    		int row = sr + dir[d][0];
    		int col = sc + dir[d][1];
    		
    		if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
    			ArrayList<String> rres = getMazePathsGeneric(row, col, dr, dc, dir, dirS);
    			for(String s : rres) {
    				myRes.add(dirS[d] + s);
    			}
    		}
    	}
    	
        return myRes;
    }
}
