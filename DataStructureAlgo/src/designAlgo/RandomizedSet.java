package designAlgo;

import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
	 /** Initialize your data structure here. */
	static HashMap<Integer, Integer> map1=new HashMap<Integer, Integer>();
	static HashMap<Integer, Integer> map2=  new HashMap<Integer, Integer>();
    public RandomizedSet() {
        
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
    	System.out.println("Insert -"+val);
    	
    	 if(map1.containsKey(val)){
             return false;
         }else{
             map1.put(val, map1.size());
             map2.put(map2.size(), val);
         }
         return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
    	System.out.println("Remove -"+val);
    	int indx=0;
    	if (map1.containsKey(val))
        {
         indx=	map1.remove(val);
         map2.remove(indx);
        
        // if empty nothing to be done
        if (map2.size()==0) return true;
        //if item was last index, nothing need to be done
        if (indx==map2.size()) return true;
        
        //swap last item with removed item index
        int key1=map2.get(map2.size());
        map1.put(key1, indx);
        map2.remove(map2.size());
        map2.put(indx, key1);
        return true;
        }
        else
        {return false;}
        
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
    	System.out.println("Get random");
    	
    	if (map1.size()==0) return -1;
        if (map2.size()==1) return map1.get(map2.get(0)) ;
    	Random random = new Random();
        int indexloc=random.nextInt(map2.size()-1);
        return map1.get(map2.get(indexloc));
    }

}
