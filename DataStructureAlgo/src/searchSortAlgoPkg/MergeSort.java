package searchSortAlgoPkg;

public class MergeSort extends SortHelper {

	public static int[] sort(int[] input)
	{
		 MergesortRec(input);
		 return input;
	}
	static void  MergesortRec( int[] input)
	{
		if (input==null || input.length==1) return ;
		int midPoint=input.length/2+ input.length%2;
		int[] firsthalf=new int[midPoint];
		int[] secondhalf=new int[input.length- midPoint];
		
		split(input, firsthalf,secondhalf);
		MergesortRec(firsthalf);
		MergesortRec(secondhalf);
		
		merge(input, firsthalf, secondhalf);
		
		System.out.println("");
		System.out.println("Printing after merge");
		printArray(input);
		
	}
	
	static void split(int[] input, int[] firstList,int[] secondList)
	{
		int i=0;
		int secondHalfStartIndex=firstList.length;
		System.out.println("Printing before splitting");
		
		for (int item:input)
		{
			if (i<secondHalfStartIndex)
			{
				firstList[i]=input[i];
			}
			else
			{
				secondList[i-secondHalfStartIndex]=input[i];
			}
			i++;
		}
		System.out.println("First list");
		printArray(firstList);
		System.out.println("Second list");
		printArray(secondList);
	}
	
	static void merge(int[] mergedList, int[] firstList,int[] secondList)
	{
		int counter=0;
		int firstlistCounter=0;
		int secondlistCounter=0;
		//sort items from both list till one of them finish
		System.out.println("Now Merging..");
		while(firstlistCounter<firstList.length
				&& secondlistCounter<secondList.length
				)
		{
			//now add to new list in sorted, incoming lists are already sorted
			
			if (firstList[firstlistCounter]<secondList[secondlistCounter])
			{
				// add item from first list to merge list
				mergedList[counter]=firstList[firstlistCounter];
				firstlistCounter++;
			}
			else if(secondlistCounter<secondList.length)
			{
				mergedList[counter]=secondList[secondlistCounter];
				secondlistCounter++;
			}
			counter++;
		}
		// now add remaining items from remaining list
		if (firstlistCounter<firstList.length)
		{
			while(firstlistCounter<firstList.length)
			{
				mergedList[counter++]=firstList[firstlistCounter++];
				
						
			}
		}
		//remaining items from second list if any	
		if (secondlistCounter<secondList.length)
		{
		
			while(secondlistCounter<secondList.length)
			{
				mergedList[counter++]=secondList[secondlistCounter++];
				
						
			}
		}
			
	}
}
