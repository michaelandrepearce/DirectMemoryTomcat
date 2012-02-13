package tea.coffee;


public interface CRUDS<K,V> {
	
    public void create(K key, V value);
    
    public V read(K key);
    
    public void update(K key, V value);
    
    public void delete(K key);
    
    public Long size();
	
}
