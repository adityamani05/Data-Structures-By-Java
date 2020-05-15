class Insertion
{
	int arr [] = {8,89,1,27,68,55,101,5,117,91,81,33,107};
	int size = arr.length;
	
	public void print()
	{
		for (int j=0;j<size;j++) 
		{
			System.out.print(arr[j]+" ");	
		}
		System.out.println();
	}

	public void sort()
	{
		int min,hold=0,j,v,count=0;
		for (int i=1;i<size;i++)
		{
			v=arr[i];
			j=i;
			while(j>=1 && arr[j-1]>v )
			{
				count++;
				arr[j]=arr[j-1];
				System.out.println("Step:"+count);
				j--;
			}
			arr[j]=v;
			print();
		}
	}
	public static void main(String[] args) 
	{
		Insertion is = new Insertion();
		is.print();
		is.sort();
		is.print();
	}
}