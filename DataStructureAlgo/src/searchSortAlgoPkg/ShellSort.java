package searchSortAlgoPkg;
/*
 * USES INSERTION SORT HAVILY
 * FIRS USE INCREMENT COUNTER LIKE 3 THEN USE 1 
 * 
 * 
 * */
public class ShellSort extends SortHelper {

	public static int[] sort(int[] input)
	{
		
		shellSort(input, 3);
		shellSort(input, 1);
		return input;
	}
	static int[] shellSort(int[] input,int incremental)
	{
		if(input==null || input.length<2) return input;

		//
		//make sublist of incremental
		for (int i=0;i<input.length;i++)
		{
			
			for (int j=Math.min(i+incremental,input.length-1);j-incremental>=0;j=j-incremental)
			{
				//i is max index for sublist
				if (input[j]<input[j-incremental])
				{
					swap(input,j,j-incremental);
					//fit this item in proper place using bubble sort
					printArray(input);
				}
				else
				{
					System.out.println("Sublist already sorted");
					break;
				}
			}
		}
		System.out.println("Sorting completed");
		
		return input;
	}
	
}
