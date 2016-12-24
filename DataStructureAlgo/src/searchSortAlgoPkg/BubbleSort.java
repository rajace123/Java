package searchSortAlgoPkg;
//run multiple time starting from last to already sorted item (2 loop) and compare adjacent nodes 
public class BubbleSort extends SortHelper {

	public static int[] sort(int[] input)
	{
		boolean swap=true;
		if(input==null || input.length<2) return input;
		for (int i=0;i<input.length;i++){
			swap=false;
			for (int j=input.length-1;j>i;j--)
			{
				if (input[j]<input[j-1])
				{
					swap(input,j,j-1);
					swap=true;
					printArray(input);
				}
			
			}
			if (swap==false)break;
		}
		
		return input;
	}
	
}
