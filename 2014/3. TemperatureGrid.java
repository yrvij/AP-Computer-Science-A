public class TemperatureGrid {
	private double[][] temps;

	private double computeTemp(int row, int col) {
		if (row == 0 || row == temps.length || col == 0 || col == temps[0].length) {
			return temps[row][col];
		} else {
			return (temps[row-1][col] + temps[row+1][col] + temps[row][col-1] + temps[row][col+1]) / 4;
		}
	}

	public boolean updateAllTemps(double tolerance) {
		double[][] temp_temps = new double[temps.length][temps[0].length];
		for (int i = 0; i < temp_temps.length; i++) {
			for (int j = 0; j < temp_temps[0].length; j++) {
				temp_temps[i][j] = computeTemp(i,j);
			}
		}
		for (int i = 0; i < temps.length; i++) {
			for (int j = 0; j < temps[0].length; j++) {
				temps[i][j] = temp_temps[i][j];
			}
		}

		for (int i = 0; i < temps.length; i++) {
			for (int j = 0; j < temps[0].length; j++) {
				if (Math.abs(temp_temps[i][j]-temps[i][j]) > tolerance) {
					return false;
				}	
			}
		}
	}
}

// 9