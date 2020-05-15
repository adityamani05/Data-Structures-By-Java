class MergeSortPro
{
	static int [] temp = new int [10];
	public static void mergeSort(int []A,int left,int right)
	{
		if(right>left)
		{
			int mid =((left+right)/2);
			mergeSort(A,left,mid);
			mergeSort(A,mid+1,right);
			merge(A,left,mid,right);
		}
	}

	public static void merge(int arr[], int l, int m, int r) 
	{ 
    	int i, j, k; 
    	int n1 = m - l + 1; 
    	int n2 =  r - m; 
 	    int L[] = new int[n1];
 	    int R[] = new int[n2];; 
    	for (i = 0; i < n1; i++) 
        	L[i] = arr[l + i]; 
    	for (j = 0; j < n2; j++) 
        	R[j] = arr[m + 1+ j]; 
        //printSorted(L);
        //printSorted(R);
 	    i = 0; 
    	j = 0;  
    	k = l;  
    	while (i < n1 && j < n2) 
    	{ 
        	if (L[i] <= R[j]) 
        	{ 
            	arr[k] = L[i]; 
            	i++; 
        	} 
        	else
        	{ 
            	arr[k] = R[j]; 
            	j++; 
        	} 
        	k++; 
    	}	 
  
    	while (i < n1) 
    	{ 
        	arr[k] = L[i]; 
        	i++; 
        	k++; 
    	} 
  
    
    	while (j < n2) 
    	{ 
        	arr[k] = R[j]; 
        	j++; 
        	k++; 
    	} 
    	printSorted(arr);
	} 


	public static void printSorted(int []arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println();
	}
	public static void main(String[] args) 
	{
		int []A = {15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0,-1};
		int left = 0;
		printSorted(A);
		int right = A.length-1;
		mergeSort(A,left,right);
		printSorted(A);	
	}
}	