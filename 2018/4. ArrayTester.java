public class ArrayTester {

	/** Returns an array containing the elements of column c of arr2D in the same order as
	 *  they appear in arr2D.
	 *  Precondition: c is a valid column index in arr2D.
	 *  Postcondition: arr2D is unchanged
	 */
	public static int[] getColumn(int[][] arr2D, int c) {
		int[] column = new int[arr2D.length];
		for (int i = 0; i < arr2D.length; i++) {
			column[i] = arr2D[i][c];
		}
		return column;
	}

	/** Returns true if and only if every value in arr1 appears in arr2.
	 *  Precondition: arr1 and arr2 have the same length.
	 *  Postcondition: arr1 and arr2 are unchanged.
	 */
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		/* implementation not shown */ 
	}

	/** Returns true if arr contains any duplicate values;
	 *          false otherwise.
	 */
	public static boolean containsDuplicates(int[] arr) {
		/* implementation not shown */ 
	}

	/** Returns true if square is a Latin square as described in part (b);
	 *          false otherwise.
	 *  Precondition: square has an equal number of rows and columns.
	 				  square has at least one row.
	 */
	public static boolean isLatin(int[][] square) {
		/** Conditions to be Latin Square:
		 *	#1. first row -> no duplicates
		 *  #2. first row values -> appear in each row 
		 *  #3. first row values -> appear in each column
		 */

		int[] first_row = square[0];

		// Condition 1:
		boolean condition1 = containsDuplicates(first_row);

		// Condition 2:
		boolean condition2 = true;
		for (int i = 0; i < square.length; i++) {
			if (!(hasAllValues(first_row,square[i]))) {
				condition2 = false;
				break;
			}
		}

		// Condition 3:
		boolean condition3 = true;
		for (int i = 0; i < square[0].length; i++) {
			if (!(hasAllValues(first_row,getColumn(square,i)))) {
				condition3 = false;
				break;
			}
		}

		return condition1 && condition2 && condition3;
	}

}