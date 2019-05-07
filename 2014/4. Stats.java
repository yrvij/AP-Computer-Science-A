public class ScoreInfo {
	private int score;
	private int numStudents;

	public ScoreInfo(int aScore) {
		score = aScore;
		numStudents = 1;
	}

	public void increment() {
		numStudents++;
	}

	public int getScore() {
		return score;
	}

	public int getFrequency() {
		return numStudents;
	}
}

public class Stats {
	private ArrayList<ScoreInfo> scoreList;

	public boolean record(int score) {
		if (scoreList.size() == 0) {
			scoreList.add(new ScoreInfo(score));
		} else {
			for (int i = 0; i < scoreList.size(); i++) {
				if (scoreList.get(i).getScore() == score) {
					scoreList.get(i).increment();
					return false;
				} else if (scoreList.get(i).getScore() < score) {
					scoreList.add(i,new ScoreInfo(score));
				} else {
					scoreList.add(new ScoreInfo(score));
				}
			}
		}
		return true;
	}

	public void recordScores(int[] stuScores) {
		for (int score : stuScores) {
			record(score);
		}
	}
}

// 9