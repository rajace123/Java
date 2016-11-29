package mathAlgoPkg;

public class mathAlgo {

	/*
	 Given an array of integers A and let n to be its length.

		Assume Bk to be an array obtained by rotating the array A k positions clock-wise, we define a "rotation function" F on A as follow:
		
		F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
		
		Calculate the maximum value of F(0), F(1), ..., F(n-1).
		
		Note:
		n is guaranteed to be less than 105.
		
		Example:
		
		A = [4, 3, 2, 6]
		
		F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
		F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
		F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
		F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26
		
		So the maximum value of F(0), F(1), F(2), F(3) is F(3) = 26.
	 * */
	public static int rotateArrayAndGetMaxSum(int[] values)
	{
		int rotateCount=0;
		int maxSum=0;
		int tempSum=0;
		if (values==null) return 0;
		if (values.length==1) return values[0];
		while(rotateCount<values.length-1)
		{
			tempSum= getRotatingSum(values);
			if (tempSum>maxSum)
			{
				maxSum=tempSum;
			}
			rotateClockwiseArray(values,values.length-1);
			rotateCount++;
		}
		
		tempSum= getRotatingSum(values);
		if (tempSum>maxSum)
		{
			maxSum=tempSum;
		}
		System.out.println("max sum is-"+ maxSum);
		return maxSum;
		
	}
	private static int getRotatingSum(int[] values)
	{
		int multiplier=0;
		int count=0;
		int sum=0;
		while (count<values.length)
		{
			sum=sum+values[count]*multiplier;
			count++;multiplier++;
		}
		System.out.println("Sum is-"+sum);
		return sum;
	}
	private static void rotateClockwiseArray(int[] values,int pos)
	{
		//A = [4, 3, 2, 6]
		//6		4		3		2
		//replace in place
		int  loopCount=0;
		int prevIndex=0;
		int temp=values[pos];
		
		//shift all items next to it to one position next
		//add temp to pos+1
		System.out.println("Rotating array-"+ pos);
		while (loopCount<values.length)
		{
			if (pos<0){
				pos=values.length-1-(-pos);
				prevIndex=pos-1;
			}
			else if(pos==0)
				{
					prevIndex=pos+values.length-1;
				}
			else
				{
					prevIndex=pos-1;
				}
			//swap them
			System.out.println("Pos value-"+pos);
			values[pos]=values[prevIndex];
			
			//
		pos--;	
		loopCount++;	
		}
		
		//if it was last item, move to first position 
		if (pos==values.length-1)
		{
			values[pos]=temp;
		}
		else
		{
			values[pos+1]=temp;
			
		}
		
		printArrayElement(values);
	}
	public static void printArrayElement(int[] a)
	{
		for(int item:a)
		{
			System.out.println(item);
			
		}
		
	}
	
}
