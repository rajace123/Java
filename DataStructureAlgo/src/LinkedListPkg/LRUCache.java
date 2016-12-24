package LinkedListPkg;
import java.util.*;

public class LRUCache {
	
	public static HashMap<Integer,Integer>hm;
    public static Deque<Integer> dl;
    private static long totalCapacity;
    public LRUCache(int capacity) {
    	hm=new HashMap<Integer,Integer>(capacity);
        dl=new ArrayDeque<Integer>(capacity);
        totalCapacity=capacity;
        System.out.println("Total capacity-"+ totalCapacity);
    
    }
    
    public int get(int key) {
        	if (hm.containsKey(key))
    		{
    			addLatestToList(key);
    			return hm.get(key);
    		}
    		else
    		{
    			return -1;
    		}
        
    }
    
    public void set(int key, int value) {
    	    
    	if (hm.size()>=totalCapacity)
    	{
    		System.out.println("Capacity reached removing last");
    		
    		hm.remove(dl.pop());
    	}
    	
    	hm.put(key, value);
    	dl.push(key);;
    }
    private void addLatestToList(int key)
    {
    	System.out.println("Remove current from queue on access-"+ key);
    	dl.removeFirstOccurrence(key);
    	System.out.println("Add again to queue"+ key);
    	
    	dl.push(key);
    }
    
}