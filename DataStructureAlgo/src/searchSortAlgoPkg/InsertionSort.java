package searchSortAlgoPkg;
//make sub list from first item and sub loop from sublist+1 till 0
public class InsertionSort extends SortHelper {
	public static int[] sort(int[] input)
	{
		boolean swap=true;
		if(input==null || input.length<2) return input;

		
		//make sublist
		for (int i=0;i<input.length-1;i++)
		{
			//pick i+1 item and compare with list till i and then swap till 0 if not sorted in sublist
			// break sublist if already sorted
			//i is max index for sublist
			for (int j=i+1;j>0;j--){
				if (input[j]<input[j-1])//j-1 is last item in list
				{
					swap(input,j,j-1);
				}
				else
				{
					break; // new item or sublist already sorted 
				}
			}
			
		}
		System.out.println("Sorting completed");
		
		return input;
	}
	
}
