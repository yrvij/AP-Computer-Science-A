public class LogMessage {
	private String machineId;
	private String description;

	/** Precondition: message is a valid log message. */
	public LogMessage(String message) {
		int breakpt = message.indexOf(":");
		machineId = message.substring(0,breakpt);
		description = message.substring(breakpt+1);
	}

	/** Returns true if the description in this log message properly contains keyword;
	 *  		false otherwise;
	 */
	public boolean containsWord(String keyword) {
		int loc = description.indexOf(keyword);
		if (description.equals(keyword)) {
			return true;
		} else if (loc == 0) {
			return true;
		} else if (description.charAt(loc-1) == ' ') {
			return true;
		} else if (loc == description.length() - keyword.length() - 1) {
			return true;
		} else if (description.length() > keyword.length()) {
			if (description.charAt(loc+keyword.length()+1) == ' ') {
				return true;
			}
		} else {
			return false;
		}
	} 	

	public String getMachineId() {
		return machineId;
	}

	public String getDescription() {
		return description;
	}

	// There may be instance variables, constructors, and methods that are not shown.
}

public class SystemLog {
	/** Contains all the entries in this system log.
	 *  Guaranteed not be null and to contain only non-null entries.
	 */
	private List<LogMessage> messageList;

	/** Removes from the system log all entries whose descriptions properly contain keyword,
	 *  and returns a list (possibly empty) containing the removed entries.
	 *  Postcondition:
	 	 - Entries in the returned list properly contain keyword and 
	 	   are in the order
	 	 - The remaining entries in the system log do not properly contain keyword and 
	 	   are in their original order.
	 	 - The returned list is empty if no messages properly contain keyword.
	 */
	 	 
	public List<LogMessage> removeMessages(String keyword) {
		List<LogMessage> removed = new List<LogMessage>();
		for (int i = 0; i < messageList.size(); i++) {
			if (messageList.get(i).getDescription().containsWord(keyword)) {
				removed.add(messageList.remove(i));
				i--;
			}
		}
		return removed;
	}

	// There may be instance variables, constructors, and methods that are not shown.
}











