import java.util.*;

public class RandomStringChooser {
	private ArrayList<String> wordList;
	
	public RandomStringChooser(String[] wordArray) {
		for (int i = 0; i < wordArray.length(); i++) {
			wordList.add(wordArray[i]);
		}
	}
	
	public String getNext() {
		Random rand = new Random();
		if (words.size() > 0) {
			return words.remove(rand.nextInt(words.size()));
		} else {
			return "NONE";
		}
	}

}
