public class WordScrambler {
	private String[] scrambledWords;

	public WordScrambler(String[] wordArr) {
		scrambledWords = mixedWords(wordArr);
	}

	private String recombine(String word1, String word2) {
		String new1 = word1.substring(0,(word1.length() / 2));
		String new2 = word2.substring(word2.length()/2);
		return new1 + new2;
	}

	private String[] mixedWords(String[] words) {
		String[] mixed = new String[words.length()];
		for (int i = 0; i < words.length(); i += 2) {
			mixed[i] = recombine(words[i],words[i+1]);
			mixed[i+1] = recombine(words[i+1],words[i]);
		}
		return mixed;
	}
}

// 9 