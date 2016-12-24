package mathAlgoPkg;

public class maxProfit {
	public static int getMaxStockProfit(int[] arr)
	{
		if (arr==null || arr.length<2)return 0;
		//Keep track of max profit while looping
		
		int minPrice=arr[0];
		int maxPrice=0;
		for (int i=1;i<arr.length;i++)
		{
			if (arr[i]>minPrice)
			{
				maxPrice=Math.max(maxPrice,arr[i]-minPrice);
			}
			else
				minPrice=arr[i];
		}
		
		
		return maxPrice;
	}

}
