import java.util.*;
public class Traversal {
	int arr[]=new int[11];
	int preOrder(int root) {
		if(root>9) {
			return 0;
		}
		else {
			System.out.print(arr[root]+" ");
			preOrder(2*root+1);
			preOrder(2*root+2);
		}
		return 1;	
	}
	int inOrder(int root) {
		if(root>9) {
			return 0;
		}
		else {
			inOrder(2*root+1);
			System.out.print(arr[root]+" ");
			inOrder(2*root+2);
		}
		return 1;
	}
	int postOrder(int root) {
		if(root>9) {
			return 0;
		}
		else {
			postOrder(2*root+1);
			postOrder(2*root+2);
			System.out.print(arr[root]+" ");
		}
		return 1;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Traversal tv= new Traversal();
		int flag=1;
		//System.out.println("Enter the no of elements:");
		//int num = sc.nextInt();
		System.out.println("Enter Nodes:");
		for(int i=0;i<10;i++) {
			tv.arr[i]=sc.nextInt();
		}
		
		while(flag==1) {
			System.out.println("1.Preorder\t2.Inorder\t3.Postorder\t4.Exit");
			int ch = sc.nextInt();
			switch(ch) {
			case 1:
				tv.preOrder(0);
				break;
			case 2:
				tv.inOrder(0);
				break;
			case 3:
				tv.postOrder(0);
				break;
			case 4:
				flag=0;
				break;
			default:
				System.out.println("Entered Wrong Choice.\nPlease enter correct choice.");	
			}
		}
	}
}
