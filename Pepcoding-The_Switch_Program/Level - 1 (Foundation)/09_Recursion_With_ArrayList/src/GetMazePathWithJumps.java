import java.util.ArrayList;

public class GetMazePathWithJumps {

	static int[][] dir = {{0,1}, {1,0}, {1,1}};
	static String[] dirS = {"h", "v", "d"};
	
	public static void main(String[] args) {
		int n = Helper.inputInt();
		int m = Helper.inputInt();
		System.out.println(getMazePathWithJumps(0, 0, n - 1, m - 1));
		System.out.println(getMazePathWithJumpsGeneric(0, 0, n - 1, m - 1, dir, dirS));
	}
	
	private static ArrayList<String> getMazePathWithJumps(int sr, int sc, int dr, int dc){
		if(sr == dr && sc == dc) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		ArrayList<String> myRes = new ArrayList<String>();
		
		//horizontal calls
		for(int i = 1; i <= dc; i++) {
			if(sc + i <= dc) {
				ArrayList<String> rres = getMazePathWithJumps(sr, sc + i, dr, dc);
				for(String s : rres) {
					myRes.add("h" + i + s);
				}
			}
		}
		
		// vertical calls
		for (int i = 1; i <= dr; i++) {
			if (sr + i <= dr) {
				ArrayList<String> rres = getMazePathWithJumps(sr + i, sc, dr, dc);
				for (String s : rres) {
					myRes.add("v" + i + s);
				}
			}
		}
		

		// diagonal calls
		for (int i = 1; i <= dc && i <= dr; i++) {
			if (sc + i <= dc && sr + i <= dr) {
				ArrayList<String> rres = getMazePathWithJumps(sr + i, sc + i, dr, dc);
				for (String s : rres) {
					myRes.add("d" + i + s);
				}
			}
		}
		
		return myRes;
	}
	

	private static ArrayList<String> getMazePathWithJumpsGeneric(int sr, int sc, int dr, int dc, int[][] dir, String[] dirS){
		if(sr == dr && sc == dc) {
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		ArrayList<String> myRes = new ArrayList<String>();
		
		//call for every direction
		for(int d = 0; d < dir.length; d++) {
			
			//call for jumps/magnitude/radius
			for(int jump = 1; jump <= Math.max(dr,dc); jump++) {
				
				int row = sr + jump * dir[d][0];
				int col = sc + jump * dir[d][1];
				
				if(row >= 0 && col >= 0 && row <= dr && col <= dc) {
					ArrayList<String> paths = getMazePathWithJumpsGeneric(row, col, dr, dc, dir, dirS);
					for(String s : paths) {
						myRes.add(dirS[d] + jump + s);
					}
				}else
					break;
			}
		}
		
		return myRes;
	}
}
