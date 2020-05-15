class SinglyLL{
	int data;
	SinglyLL next;
	public SinglyLL(int data)
	{
		this.data=data;
		this.next=null;
	}
	public int getData()
	{
		return this.data;
	}
	public void setDate(int data)
	{
		this.data = data;
	}
}
class CheckSLL
{
	int size = 0;
	SinglyLL head=null,tail=null;
	public void addNode(int data)
	{
		SinglyLL newNode = new SinglyLL(data);
		if(head==null)
		{
			head = tail = newNode;
			size++;	
		}
		else
		{
			tail.next = newNode;
			size++; 
		}
	}
	public void printList()
	{
		SinglyLL current = head;
		if(size==0)
			System.out.println("List is empty.");			
		for(int i=0;i<=size;i++)
		{
			System.out.println(SinglyLL.getData());
		}
	}
	public static void main(String[] args) 
	{
		CheckSLL css = new CheckSLL();
		css.printList();
		css.addNode(6);
		css.printList();
	}
}