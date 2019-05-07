public interface Horse {
	String getName();
	int getWeight();
}

public class HorseBarn {
	private Horse[] spaces;

	public int findHorseSpace(String name) {

	}

	public void consolidate() {

	}
}

a)  public int findHorseSpaces(String name) {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i].getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}

b)  public void consolidate() {
		for (int i = 0; i < spaces.length; i++) {
			if (spaces[i].getName() == null) {
				for (int j = i; j < spaces.length; i++) {
					if (spaces[j].getName() != null) {
						Horse temp = spaces[j];
						spaces[i] = temp;
						spaces[j] = null;
						break;

					}
					else if (j == spaces.length - 1) {
						return; // stops entire process
					}
				}
			}
		}
	}