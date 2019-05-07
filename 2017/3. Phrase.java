public class Phrase {
	private String currentPhrase;

	/** Constructs a new Phrase object. */
	public Phrase(String p) {
		currentPhrase = p;
	}

	/** Returns the index of the nth occurence of str in the current phrase;
	 *  returns -1 if the nth occurrence does not exist.
	 *  Precondition: str.length() > 0 and n > 0
	 *  Postcondition: the current phrase is not modified.
	 */
	public int findNthOccurrence(String str, int n) {
		/* implementation not shown */
	}

	/** Modifies the current phrase by replacing the nth occurrence of str with repl.
	 *  If the nth occurrence does not exist, the current phrase is unchanged.
	 *  Precondition: str.length() > 0 and n > 0
	 */
	public void replaceNthOccurrence(String str, int n, String repl) {
		int start = findNthOccurrence(str,n);
		int strlen = str.length();
		if (start != -1) {
			currentPhrase = currentPhrase.substring(0,start) + repl + currentPhrase.substring(start+strlen);
		}
	}

	/** Returns the index of the last occurrence of str in the current phrase;
	 *  returns -1 if str is not found.
	 *  Precondition: str.length() > 0
	 *  Postcondition: the current phrase is not modified.
	 */
	public int findLastOccurence(String str) {
		int last = -1;
		int n = 1;
		while (findNthOccurence(str,n) != -1) {
			if (findNthOccurence(str,n) > last) {
				last = findNthOccurence(str,n);
			} 
			n++;
		}
		return last;
	}

	/** Returns a string containing the current phrase. */
	public String toString() {
		return currentPhrase;
	}
}