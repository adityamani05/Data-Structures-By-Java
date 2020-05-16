import java.util.*;
public class BinaryTree {
	int arr[]=new int[20];
	public int count=0;
	int i=0;
	void insert() { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter root:");
		int data=sc.nextInt();
		arr[0]=data;
		leftInsert(count);
		rightInsert(count);
		display();
	}
	void leftInsert(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter left child:");
		int left=sc.nextInt();
		arr[2*i+1] = left;
		int gin=2*i+1;
		System.out.println("you want to insert there childs if yes press 1 otherwise 0");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("for Parent "+ left);
			leftInsert(gin);
			System.out.println("for Parent "+ left);
			rightInsert(gin);
			break;
		case 0:
			break;
		default:
			System.out.println("Enter wrong choice");
		}
	}
	void rightInsert(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter right child:");
		int right=sc.nextInt();
		arr[2*i+2]=right;
		int gin=2*i+2;
		System.out.println("you want to insert there childs if yes press 1 otherwise 0");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("for Parent "+ right);
			leftInsert(gin);
			System.out.println("for Parent "+ right);
			rightInsert(gin);
			break;
		case 0:
			break;
		default:
			System.out.println("Entered wrong choice");
		}
	}
	void display() {
		int i=0;
		while(arr[i]!=0) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println(arr[i+1]);
	}
	public static void main(String[] args) {
		BinaryTree bt= new BinaryTree();
		bt.insert();
		bt.display();
	}
}
