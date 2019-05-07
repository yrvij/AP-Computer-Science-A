public class ClimbInfo {

	public ClimbInfo(String peakName, int climbTime) {
		/* implementation not shown */
	}

	public String getName() {
		/* implementation not shown */
	}

	public int getTime() {
		/* implementation not shown */
	}
}

public class ClimbingClub {
	private List<ClimbInfo> climbList;

	public ClimbingClub() {
		climbList = new ArrayList<ClimbInfo>();
	}

	public void addClimb(String peakName, int climbTime) {

	}

	public int distinctPeakNames() {

	}
}


a) 	public void addClimb(String peakName, int climbTime) {
		climbList.add(new ClimbInfo(peakName,climbTime));
    }

b)  public void addClimb(String peakName, int climbTime) {
		if (climbList.size() == 0) {
			climbList.add(new ClimbInfo(peakName,climbTime));
		} else {
			boolean placed = false;
			for (int i = 0; i < climbList.size(); i++) {
				if (peakName.compareTo(climbList.get(i).getName()) <= 0) {
					climbList.add(i, new ClimbInfo(peakName,climbTime));
					placed = true;
					break;
				} 
			}
			if (! placed) {
				climbList.add(new ClimbInfo(peakName,climbTime));
			}
		}
		
	}

c) - No
   - Yes
