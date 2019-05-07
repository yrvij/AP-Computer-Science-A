public class SparseArrayEntry {
	/** The row index and column index for this entry in the sparse array. */
	private int row;
	private int col;

	/** The value of this entry in the sparse array. */
	private int value;

	/** Constructs a SparseArrayEntry object that represents a sparse array element
	 *  with row index r and column index c, containing value v.
	 */
	public SparseArrayEntry(int r, int c, int v) {
		row = r;
		col = c;
		value = v;
	}

	/** Returns the row index of this sparse array element. */
	public int getRow() {
		return row;
	}

	/** Returns the column index of this sparse array element. */
	public int getCol() {
		return col;
	}

	/** Returns the value of this sparse array element. */
	public int getValue() {
		return value;
	}
}

public class SparseArray {
	/** The number of rows and column in the sparse array. */
	private int numRows;
	private int numCols;

	/** The list of entries representing the non-zero elements of the sparse array. Entries are stored in the
	 *	list in no particular order. Each non-zero element is represented by exactly one entry in the list.
	 */
	private List<SparseArrayEntry> entries;

	/** Constructs an empty SparseArray. */
	public SparseArray() {
		entries = new ArrayList<SparseArrayEntry>();
	}

	/** Returns the number of rows in the sparse array. */
	public int getNumRows() {
		return numRows;
	}

	/** Returns the number of columns in the sparse array. */
	public int getNumCols() {
		return numCols;
	}

	/** Returns the value of the element at row index row and column index col in the sparse array.
	 *  Precondition: 0 <= row < getNumRows()
	 			      0 <= col < getNumCols()
	 */
	public int getValueAt(int row, int col) {
		for (SparseArrayEntry item : entries) {
			if (item.getRow() == row && item.getCol() == col) {
				return item.getVal();
			}
		}
	}

	/** Removes the column col from the sparse array.
	 *  Precondition: 0 <= col < getNumCols()
	 */
	public void removeColumn(int col) {
		int i = 0; 
		for (SparseArrayEntry item : entries) {
			if (item.getCol() == col) {
				entries.remove(i);
			}
			i++;
			
		}
	}

	// There may be instance variables, constructors, and methods that are not shown.
}