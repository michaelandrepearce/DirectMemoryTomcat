package tea.coffee;

import org.directmemory.cache.Cache;
import org.directmemory.measures.Monitor;
import org.directmemory.measures.Ram;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class DirectMemoryCache implements  CRUDS<String, String>, InitializingBean, DisposableBean {
    
    public void create(String key, String value) {
    	Cache.put(key, value);
    }
    
    public String read(String key) {
        return (String)Cache.retrieve(key);
    }
    
    public void update(String key, String value) {
    	Cache.put(key, value);
    }
    
    public void delete(String key) {
        Cache.free(key);
    }
    
    public Long size() {
        return Cache.entries();
    }


	public void destroy() throws Exception {
	    Cache.dump();
	    Monitor.dump();
	}


	public void afterPropertiesSet() throws Exception {
		Cache.init(2, Ram.Mb(100));
	}
}
