class QuickSortPro
{
	static int []arr = {12,23,143,54,3,57,56,765,8,56,8,658,76,876,8,2};
	public static void quickSort(int low,int high)
	{
		System.out.println("low is: "+low+" and high is: "+high);
		//by taking left as pivot
		if(high-low<=1)
		{
			System.out.println("---");
		}
		else
		{
			int yellow = low+1;
			for (int green=low+1;green<high;green++) 
			{
				if(arr[green]<=arr[low])
				{
					swap(yellow,green);
					System.out.println(arr[yellow]+" and "+arr[green]+" has been swapped!");
					yellow++;
					System.out.println("yellow is = "+yellow);
				}	
			}
			printFunc();
			swap(low,yellow-1);
			quickSort(low,yellow-2);
			quickSort(yellow,high);
		}
	}	
	public static void swap(int yellow,int green)
	{
		int hold=0;
		hold = arr[yellow];
		arr[yellow] = arr[green];
		arr[green] = hold;
	}

	public static void printFunc()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		int low = 0;
		int high = arr.length;
		printFunc();
		quickSort(low,high);	
		printFunc();
	}
}