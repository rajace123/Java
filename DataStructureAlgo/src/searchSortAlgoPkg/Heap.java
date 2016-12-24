package searchSortAlgoPkg;

public class Heap extends SortHelper {
	

	
	int[] items;
	public Heap(int maxSize)
	{
		items=new int[maxSize];
	}

	public int getLeftChild(int parentIdx)
	{
		int leftChildIdx=2*parentIdx+1;
		if (leftChildIdx<items.length)
			return items[leftChildIdx];
		else
			return -1;
		
		
	}
	public int getRightChild(int parentIdx)
	{
		int rightChildIdx=2*parentIdx+2;
		if (rightChildIdx<items.length)
			return items[rightChildIdx];
		else
			return -1;
		
		
	}
	public int getParent(int childIdx)
	{
		if (childIdx<0 || childIdx>=items.length) return -1;
		int parentIdx=(childIdx-1)/2;
		
		return items[parentIdx];
		
	}
	
	public int getCount()
	{
		return items.length;
	}
	public boolean isEmpty()
	{
		return items.length==0;
	}

}
