public class HiddenWord {
	private String word;

	public HiddenWord(String word) {
		this.word = word;
	}

	public String getHint(String guess) {
		String hint = "";
		boolean found = false;
		for (int i = 0; i < guess.length(); i++) {
			char letter = guess.charAt(i);
			if (letter == word.charAt(i)) {
				hint += letter;
			} else {
				for (int i = 0; i < word.length(); i++) {
					if (letter == word.charAt(i)) {
						hint += "+";
						found = true;
						break;
					}
				}
				if (! found) {
					hint += "*";
				}
			} 
		}
		return hint;
			
	}

	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS");	
		System.out.println(puzzle.getHint("AAAAA"));
	}
		
}