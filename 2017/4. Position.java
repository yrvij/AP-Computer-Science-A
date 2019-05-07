public class Position {

	/** Constructs a Position object with row r and column c. */
	public Position(int r, int c) {
		/* implementation not shown */
	}

	// There may be instance variables, constructors, and methods that are not shown. 
}

public class Successors {

	public static Position findPosition(int num, int[][] intArr) {
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[0].length; j++) {
				if (intArr[i][j] == num) {
					Position location = new Position(i,j);
					return location;
				}
			}
		}
		return null;
	}

	public static Position[][] getSuccessorArray(int[][] intArr) {
		Position[][] succ_arr = new Position[intArr.length][intArr[0].length];
		for (int i = 0; i < intArr.length; i++) {
			for (int j = 0; j < intArr[0].length; j++) {
				int value = intArr[i][j];
				Position location = findPosition(value+1,intArr);
				succ_arr[i][j] = location;
			}
		}
		return succ_arr;
	}

}