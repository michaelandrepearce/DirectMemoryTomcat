package tea.coffee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TeaCoffeeController {

	@Autowired
	@Qualifier("dataCache")
	private CRUDS<String, String> dataCache;
	
    @RequestMapping(method = RequestMethod.GET, value = "/test")
    public @ResponseBody String test() {
        return "OK";
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/create")
    public @ResponseBody Boolean create(@RequestParam("key") String key, @RequestParam("value") String value) {
    	dataCache.create(key, value);
    	return true;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/read")
    public @ResponseBody String read(@RequestParam("key") String key) {
        return dataCache.read(key);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/update")
    public @ResponseBody Boolean update(@RequestParam("key") String key, @RequestParam("value") String value) {
    	dataCache.update(key, value);
    	return true;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/delete")
    public @ResponseBody Boolean delete(@RequestParam("key") String key) {
    	dataCache.delete(key);
    	return true;
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/size")
    public @ResponseBody Long size() {
        return dataCache.size();
    }

}
