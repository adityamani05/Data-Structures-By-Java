class ShellSort
{
	int arr[] = {8,89,1,27,68,55,101,5,117,91,81,33,107};

	public void print()
	{
		for (int j=0;j<arr.length;j++) 
		{
			System.out.print(arr[j]+" ");	
		}
		System.out.println();
	}
	public void sort() // DS method
	{
		System.out.println("in Sort");
		int i,j,h=1,v,count=0;
		for(h=0;h<arr.length/12;h=3*h+1);
			//System.out.println(h);
			for (;h>0;h=h/3) 
			{
				System.out.println(h);
				for (i=h+1;i<arr.length;i+=1) 
				{
					//System.out.println(h+" "+i);
						v=arr[i];
						j=i;
						while(j>0 && arr[j-h]>v)
						{
							count++;
							arr[j]=arr[j-h];
							int a = j-h;
							System.out.println("steps:"+count);
							System.out.println(j+" "+a);
							print();
							j-=h;
						}	
						arr[j]=v;
						print();
				}
			}
	}

	public void ShellSort() //my method
	{
		int gap=arr.length/2,hold,x,y,p=7,z;

		while(gap>=1)
		{
			x = gap;
			y = gap;
			for(int i=0;i<gap;i++)
			{
				//System.out.println("Comparison between "+i+" "+x);
				while(x<arr.length && arr[i]>arr[i+gap])
				{
					hold = arr[i];
					arr[i] = arr[i+gap];
					arr[i+gap] = hold;
				}
				x++;
				print();
				if(x>=arr.length)
				{
					break;
				}
				System.out.println();
			}
			for(int i=gap;i<arr.length;i++)
			{
				///System.out.println("Comparison between "+i+" "+x);
				while(x<arr.length && arr[i]>arr[i+gap])
				{
					hold = arr[i];
					arr[i] = arr[i+gap];
					arr[i+gap] = hold;
				}
				x++;
				//print();
				if(x>=arr.length)
				{
					break;
				}
				System.out.println();
			}
			while(p>=0 && arr[p-1]>arr[p])
				{
					System.out.println("IN WHILE");
					hold = arr[p];
					arr[p] = arr[p-1];
					arr[p-1] = hold;
					p--;
				}
			

				///System.out.println("Comparison between "+i+" "+x);
			System.out.println(gap);
			gap=gap/2;
		}
	} 

	public static void main(String[] args) 
	{
		ShellSort ss = new ShellSort();
		/*ss.print();
		ss.ShellSort();
		ss.print();*/
		System.out.println("By sort()");
		ss.sort();
		ss.print();
	}
}