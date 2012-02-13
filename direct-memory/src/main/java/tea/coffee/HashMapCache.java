package tea.coffee;

import java.util.HashMap;

public class HashMapCache implements CRUDS<String, String> {

	HashMap<String, String> hashMap = new HashMap<String, String>();
	
	public void create(String key, String value) {
		hashMap.put(key, value);

	}

	public String read(String key) {
		return hashMap.get(key);
	}

	public void update(String key, String value) {
		hashMap.put(key, value);

	}

	public void delete(String key) {
		hashMap.remove(key);

	}

	public Long size() {
		return (long)hashMap.size();
	}

}
