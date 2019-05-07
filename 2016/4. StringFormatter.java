public class StringFormatter {
	public static int totalLetters(List<String> wordList) {
		int totLen = 0;
		for (String word : wordList) {
			totLen += word.length();
		}
		return totLen;
	}

	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		return (formattedLen - totalLetter(wordList)) / (wordList.size() - 1);
	}

	public static int leftoverSpaces(List<String> wordList, int formattedLen) {
		/* implementation not shown */
	}

	public static String format(List<String> wordList, int formattedLen) {
		String formattedWord = "";
		int loS = leftoverSpaces(wordList,formattedLen);
		int bGW = basicGapWidth(wordList,formattedLen);
		int j = 0;
		for (String word : wordList) {
			formattedWord += word;
			if (j < wordList.size() - 1) {
				for (int i = 0; i < bgW; i++) {
					formattedWord += " ";
				}
				if (loS > 0) {
					formattedWord += " ";
					loS--;
				}
			} 
			j++;
		}
		return formattedWord;

	}
}
