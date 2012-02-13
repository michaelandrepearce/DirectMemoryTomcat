package tea.coffee;

import java.io.Serializable;
import java.util.Map;

public class TCReturnObject implements Serializable {
	
	/**
	 * UUID
	 */
	private static final long serialVersionUID = 911675775489982915L;
	
	private Map<String, String> entries;

	public Map<String, String> getEntries() {
		return entries;
	}

	public void setEntries(Map<String, String> entries) {
		this.entries = entries;
	}

}
