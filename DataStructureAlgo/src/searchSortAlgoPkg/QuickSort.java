package searchSortAlgoPkg;

public class QuickSort extends SortHelper {

	
	public static int[] sort(int[] input)
	{
		if (input.length<2) return input;
		sort(input,0,input.length-1);
		return input;
	}
	static void sort(int[] input,int low,int high)
	{
		if (high-low<0) return;
		
		int splitPoint=split(input,low,high);
		sort(input,low,splitPoint-1); //left sub array
		sort(input,splitPoint+1,high); // right sub array
	
	}
	
	static int split(int[] input,int low, int high)
	{
		int left=low+1;
		int right=high;
		int pivot=input[low];
		
		while(true)
		{
			//Advance left pointer to right till it reached right pointer
			while (left<=right)
			{
				if (input[left]<pivot)
				{
					left++;
				}
				else
				{
					break;
				}
			}

			//now advance right pointer toward left
			while(right>left)
			{
				if (input[right]>pivot)
					right--;
				else
					break;

			}
			//Break out of loop if left is greater than right
			if (left>=right)
				break;

			//now swap left and right
			swap(input,left,right);

			left++;right--;
		}
		//now swap pivot with left-1 item
		swap(input,low,left-1);
		return left-1;
	}

}
