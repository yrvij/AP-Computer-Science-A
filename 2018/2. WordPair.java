public class WordPair {

	/** Constructs a WordPair object. */
	public WordPair(String first, String second) {
		/* implementation not shown */ 
	}

	/** Returns the first string of this WordPair object */
	public String getFirst() {
		/* implementation not shown */ 
	}

	/** Returns the second string of this WordPair object */
	public String getSeciond() {
		/* implementation not shown */
	}
}

public class WordPairList {

	/** The list of word pairs, initialized by the constructor. */
	private ArrayList<WordPair> allPairs;

	/** Constructs a WordPairList object as described in part (a).
	 *  Precondition: words.length >= 2
	 */
	public WordPairList(String[] words) {
		for (int i = 0; i < words.length; i++) {
			for (int j = i+1; j < words.length; j++) {
				allPairs.add(new WordPair(words[i],words[j]));
			}
		}
	}

	/** Returns the number of matches as described in part (b).
	 */
	public int numMatches() {
		int count = 0;
		for (WordPair pair : allPairs) {
			if (pair.getFirst().equals(pair.getSecond())) {
				count++;
			}
		}
		return count;
	}

}