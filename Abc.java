// This is basically the Singly Linked List Program
import static java.lang.System.*;
class Abc 
{
	private class Node
	{
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	Node head,tail;
	 public Abc()
	{
		head=null;
		tail=null;
	}
	public void addData(int d)
	{
		Node newNode = new Node(d);
		//out.println(newNode.data);
		if(head==null)
		{	
			head=tail=newNode;
			tail.next=null;
		}
		else
		{
			tail.next=newNode;
			tail=newNode;
			tail.next=null;
		}
	}
	public void printData()
	{
		if(head==tail)
		{
			out.println("No Data found");
		}
		else
		{
			Node current;
			current = head;
			while(current.next!=null)
			{
				out.print(current.data+" ");
				current=current.next;
			}
			out.print(current.data+" ");
		}
	}
	public void printReverse()
	{
		int [] rev = new int[6]; 
		if(head==tail)
		{
			out.println("No Data found");
		}
		else
		{
			Node current;
			current = head;
			int i=0;
			while(current.next!=null)
			{
				rev[i]=current.data;
				i++;
				current=current.next;
			}
			out.println();
			rev[i]=current.data;
			for (int j=5;j>=0 ;j-- ) 
			{
				out.print(rev[j]+" ");
			}
		}
	}
	public void addfirst(int d)
	{
		Node ne = new Node(d);
		if(head==null)
		{
			head=tail=ne;
		}
		else
		{
			ne.next=head;
			head=ne;
		}
	}
	public void reverse()
	{
		Abc b = new Abc();
		Node current;
		current=head;
		while(current.next!=null)
		{
			Node n = new Node(current.data);
			b.addfirst(n.data);
			current=current.next;
		}
		Node n = new Node(current.data);
		b.addfirst(n.data);
		b.printData();
	}
	public void sort()
	{
		Node current,compare=null;
		int d;
		current=head;
		for (int i=0;i<6;i++)
		{
		current=head;
		while(current.next!=null)
		{
			compare=current.next;
			while(compare.next!=null)
			{
				if(current.data>compare.data)
				{
					d = current.data;
					current.data = compare.data;
					compare.data = d;
					break;
				}
				compare=compare.next;
					//current=current.next;
			}
			//compare=compare.next;
			if(current.data>compare.data)
				{
					d = current.data;
					current.data = current.next.data;
					current.next.data = d;
				}
			current=current.next;
		}
		while(compare.next!=null)
			{
				if(current.data>compare.data)
				{
					d = current.data;
					current.data = current.next.data;
					current.next.data = d;
					break;
				}
				compare=compare.next;
					//current=current.next;
			}
			//compare=compare.next;
			if(current.data>compare.data)
				{
					d = current.data;
					current.data = current.next.data;
					current.next.data = d;
				}
		}
	}
	public static void main(String args[])
	{
		Abc a = new Abc();
		a.printData();
		a.addData(11);
		a.addData(89);
		a.addData(723);
		a.addData(898);
		a.addData(13);
		a.addfirst(600);
		a.printData();
		out.println();
		a.printReverse();
		out.println();
		out.println();
		a.reverse();
		a.printData();
		out.println();
		a.sort();
		out.println();
		out.println("after sorting:");
		a.printData();
		out.println();

		}	
	}
