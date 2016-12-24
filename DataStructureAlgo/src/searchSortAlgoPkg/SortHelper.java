package searchSortAlgoPkg;

public class SortHelper {

	protected static void swap(int[] input, int startId,int endId)
	{
		int temp=input[startId];
		input[startId]=input[endId];
		input[endId]=temp;
		
	}
	/*helper method*/
	protected static void printArray(int[] input)
	{
		System.out.println("Printing array****");
		for (int i:input)
		{
			System.out.print( i);
		}
		System.out.println("");
	}
}
