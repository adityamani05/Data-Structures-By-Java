import static java.lang.System.*;
class SLLReverse 
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
	 public SLLReverse()
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
	public void printThird()
	{
		System.out.println();
		if(head==tail)
		{
			out.println("No Data found");
		}
		else
		{
			Node current;
			current = head;
			while(current.next.next.next!=null)
			{
				//out.print(current.data+" ");
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
		SLLReverse b = new SLLReverse();
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
	public static void main(String args[])
	{
		SLLReverse a = new SLLReverse();
		a.printData();
		a.addData(14);
		a.addData(15);
		a.addData(73);
		a.addData(43);
		a.addData(1364);
		a.addfirst(120);
		a.printData();
		out.println();
		a.printReverse();
		out.println();
		out.println();
		a.reverse();
		a.printThird();
		}	
	}