class Knapsack
{
	public static int knapsackSol(int no,int weight,int []wt,int []value)
	{
		int [][]k = new int[no+1][weight+1];
		for (int i=0;i<=no;i++) 
		{
			for(int w=0;w<=weight;w++)
			{
				if(i==0 || w==0)
					k[i][w]=0;
				else if(wt[i-1]<=w)
					k[i][w] = max(value[i-1] + k[i-1][w-wt[i-1]],  k[i-1][w]);
				else
					k[i][w]=k[i-1][w];
				
			}	
		}
		return k[no][weight];
	}
	public static int max(int a,int b)
	{
		return (a>b)?a:b;
	} 

	public static void main(String[] args) 
	{
		int wt[] = {4,6,8};
		int value[] = {10,12,15};
		int weight = 10;
		int no = wt.length;
		System.out.println(knapsackSol(no,weight,wt,value));
	}
}