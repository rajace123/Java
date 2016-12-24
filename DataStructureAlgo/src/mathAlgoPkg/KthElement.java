package mathAlgoPkg;

import java.util.Collections;
import java.util.PriorityQueue;

public class KthElement {
	
	public int findKthLargestPriorityQueue(int[] nums, int k) {
        
		if (nums==null) return -1;
		if (nums.length<k) return -1;
		
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
		 for (int num: nums)
		 {
			 pq.offer(num);
			 if (pq.size()>k)
				 pq.poll();
		 }
		 return pq.peek();
    }

}
