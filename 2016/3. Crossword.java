public class Square {

	public Square(boolean isBlack, int num) {
		/* implementation not shown */
	}

}

public class Crossword {
	private Square[][] puzzle;

	public Crossword(boolean[][] blackSquares) {
		int count = 1;
		puzzle = new Square[blackSquares.length][blackSquares[0].length];
		for (int i = 0; i < blackSquares.length; i++) {
			for (int j = 0; j < blackSquares[0].length; j++) {
				if (toBeLabeled(i,j,blackSquares)) {
					puzzle[i][j] = new Square(blackSquares[i][j],count);
					count++;
				} else {
					puzzle[i][j] = new Square(blackSquares[i][j],0);
				}
			}
		}
	}

	private boolean toBeLabeled(int r, int c, boolean[][] blackSquares) {
		boolean isWhite = !(blackSquares[r][c]);
		boolean bordersWhite;
		if (r == 0 || c == 0) {
			bordersWhite = false;
		} else {
			bordersWhite = !((blackSquares[r-1][c]) || (blackSquares[r][c-1]))
		}

		return isWhite && !(bordersWhite);
	}


}