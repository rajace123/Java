package searchSortAlgoPkg;

public class SelectionSort extends SortHelper  {
	//Ascending order short, integer
	public static int[] sort(int[]input)
	{
		if (input==null || input.length<2) return input ;
		
		for (int i=0; i<input.length;i++)
		{
			for (int j=i+1;j<input.length;j++)
			{
				if (input[j]<input[i])
				{
					swap(input,i,j);
					printArray(input);
				}
			}
		}
		return input;
		
	}
	

}
