import java.util.*;
public class PrintTree {
	public class Node{
		 Node left;
		 int data;
		 Node right;
		 
		 public Node(int d) {
			 left=null;
			 this.data=d;
			 right=null;
		 }
	}
		 Node head,tail;
		 public PrintTree(){
			 head=null;
			 tail=null;
		 }
		 
	void add(int d) {
		//Scanner sc= new Scanner(System.in);
		Node n = new Node(d);
		if(head==null) {
			head=tail=n;
			head.left=null;
			head.right=null;
			System.out.println("Added succesfully.");
		}
		
	}
	void addchild(int d,int c) {
		Scanner sc= new Scanner(System.in);
		Node n = new Node(d);
		if(c==1) {
			Node temp1=n;
			head.left=n;
			temp1.left=null;
			temp1.right=null;
		}
		if(c==2) {
			Node temp2=n;
			head.right=n;
			temp2.left=null;
			temp2.right=null;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the node:");
		int data=sc.nextInt();
		System.out.println("");
		int flag=1;
		while(flag==1) {
			System.out.println("Want to add its chaild: 1.yes/t2.no");
			int ch= sc.nextInt();
			switch(ch) {
			case 1:
				System.out.println("Enter left child.");
				break;
			case 2:
				flag=2;
		}
		
		}
	}

}
