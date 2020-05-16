import java.util.*;
public class BinarySearchTree {
	int arr []=new int [30];
	int root=0;
	BinarySearchTree() {
		root=0;	
	}
	int insert(int root,int data) {
		if(arr[0]==0){
			arr[0]=data;
			return 0;
		}
		else if(data<=arr[root]&&arr[root*2+1]==0) {
			arr[root*2+1]=data;
			return 1;
		}
		else if(data>=arr[root]&&arr[root*2+2]==0) {
			arr[root*2+2]=data;
			return 0;
		}
		else {
			if(data<=arr[root]) {
				root=root*2+1;
				insert(root,data);
			}
			else {
				root=root*2+2;
				insert(root,data);
			}
		}
		return 0;
	}
	int search(int root,int data) {
		if(root>10) {
			return 0;
		}
		else {
		if(arr[0]==0) {
			System.out.println("No elements.");
			return 0;
		}
		else if(data==arr[root]) {
			System.out.println("Element present at index: "+ root);
			return 1;
			}
		else if(data<=arr[root]&&arr[root*2+1]==data) {
			System.out.println("Element present at index: "+ root*2+1);
			return 1;
		}
		else if(data>arr[root]&&arr[root*2+2]==data) {
			System.out.println("Element present at index: "+ root*2+2);
			return 1;
		}
		else {
			if(data<=arr[root]) {
				root=root*2+1;
				if(search(root,data)!=1);{
				return 0;}
			}
			else {
				root=root*2+2;
				if(search(root,data)!=1);{
				return 0;}
			}
		}
		//return 0;
		}
	}
	int inOrder(int root) {
		if(root>10) {
			return 0;
		}
		else {
			inOrder(2*root+1);
			System.out.print(arr[root]+" ");
			inOrder(2*root+2);
		}
		return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree bst = new BinarySearchTree();
		Scanner sc= new Scanner (System.in);
		int flag=1;
		while(flag==1) {
			System.out.println("1.Enter nodes\t 2.print nodes\t 3.print array\t 4.Traverse tree\t 5.search an element\t 6.exit");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				for(int i=0;i<10;i++) {
					System.out.println("Enter the Node");
					int d = sc.nextInt(); 
					bst.root=0;
					bst.insert(bst.root, d);
				}
				break;
			case 2:
				for(int j=0;j<=20;j++) {
					if(bst.arr[j]!=0) {
						System.out.print(bst.arr[j]+" ");
					}}
				System.out.println();
				break;
			case 3:
				for(int k=0;k<=20;k++) {
					System.out.print(bst.arr[k]+" ");
				}
				System.out.println();
				break;
			case 4:
				bst.inOrder(0);
				break;
			case 5:
				System.out.println("Enter the element you want to search:");
				int ele=sc.nextInt();
				if(bst.search(0, ele)==0) {
					System.out.println("Element not found:");}
				break;
			case 6:
				flag=0;		
				break;
			default:
				System.out.println("Entered wrong choice.");
	}
	}
}}
