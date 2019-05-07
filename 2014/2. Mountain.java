public class Mountain {

	public static boolean isIncreasing(int[] array, int stop) {
		/* implementation not shown */
	}

	public static boolean isDecreasing(int[] array, int start) {
		/* implementation not shown */
	}

	public static int getPeakIndex(int[] array) {
		for (int i = 1; i <= array.length() - 1; i++) {
			if (isIncreasing(array,i) && isDecreasing(array,i)) {
				return i;
			}
		}
		return -1;
	}

	public static boolean isMountain(int[] array) {
		return isIncreasing(array,getPeakIndex(array)) && isDecreasing(array,getPeakIndex(array));
	}

	// 8