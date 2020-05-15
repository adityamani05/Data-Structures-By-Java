class SelectionSort
{
	int [] arr ={11,2,33,6,1,4,18,2,54,32,65,224,42};
	int max,min;

	public void sort()
	{
		for(int i=0;i<arr.length-1;i++)
		{	
			min = i;
			for (int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min])
					min=j;
			}
			int temp = arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
			System.out.println("Step:"+i);
			printArr();	
		}
	}
	public void printArr()
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) 
	{
		SelectionSort ss = new SelectionSort();
		ss.printArr();
		ss.sort();
		ss.printArr();	
	}
}