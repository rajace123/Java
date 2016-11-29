package LinkedListPkg;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class HeapAlgo {

	public static int[] sliddingWindowMax(int[] input, int maxWindow)
	{
		if (input==null || input.length<maxWindow|| maxWindow<0)return null;
		if (input.length==0 || maxWindow==0) return new int[0];
		int[] result=new int[input.length-maxWindow+1];
		PriorityQueue<Integer> heap=new PriorityQueue<Integer>(maxWindow,Collections.reverseOrder());
		int counter =0;
		//Populate max window item to heap
		while (counter<maxWindow)
		{
			heap.offer(input[counter]);
			counter++;
			
		}
		for (int i=0 ;i<input.length-maxWindow;i++)
		{
			result[i]=heap.peek();
			heap.remove(input[i]);
			if (i+maxWindow <input.length)
			{
				heap.offer(input[i+maxWindow]);
			}
		}
		result[result.length-1]=heap.poll();
		return result;
	}
}
