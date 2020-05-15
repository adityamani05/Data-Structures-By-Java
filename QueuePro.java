class QueuePro
{
	int size=0,front=-1,rear=-1,CAPACITY=10;
	int [] QuePro= new int[CAPACITY];
	
	public void enqueue(int d)
	{
		if(rear==CAPACITY-1 && QuePro[0]==0 )
		{
			rear=0;
		}
		if(front==rear-1 || rear==9)
		{
			System.out.println("Queue is full");
		}
		else
		{
			if(rear==-1 && front==-1)
			{
				rear=front=0;
				size++;
				QuePro[rear]=d;
				System.out.println("Data is Added");
			}
			else
			{
				size++;
				rear++;
				QuePro[rear]=d;
				System.out.println("Data is Added");
			}
		}
	}
	public int dequeue()
	{
		int data;
		if(front==CAPACITY-1 && QuePro[0]==0 )
		{
			front=0;
		}
		if(front==-1)
		{							
			System.out.println("Queue is Empty");
			return 0;
		}
		else
		{
			data = QuePro[front];
			front++;
			size--;
			System.out.println(data+" is Deleted");
			return data;
		}
	}
	public void isEmpty()
	{
		if(front==-1)
		{
			System.out.println("Queue is empty");
		}
		else
		{
			System.out.println("Queue is not empty");
		}
	}
	public void size()
	{
		System.out.println("Size of Queue is "+size);
	}
	public void front()
	{
		if(front==-1)
		{
			System.out.println("Queue is Empty. No front available");
		}
		else
		{
			System.out.println("Front of Queue is "+QuePro[front]);
		}
	}
	public String toString()
	{
		String str="";
		if(front>-1)
		{
			for(int i=front;i<=rear;i++)
			{
				str=str+" "+QuePro[i];
			}
		}
		return str;
	}
	public static void main(String[] args) 
	{
		QueuePro qp = new QueuePro();
		qp.isEmpty();
		qp.size();
		qp.front();
		System.out.println(qp);
		qp.enqueue(10);
		qp.isEmpty();
		qp.size();
		qp.front();
		qp.enqueue(20);
		System.out.println(qp);
		qp.isEmpty();
		qp.size();
		qp.front();
		qp.enqueue(30);
		qp.enqueue(40);
		qp.enqueue(50);
		qp.dequeue();
	 	qp.enqueue(60);
	 	qp.enqueue(30);
		qp.enqueue(40);
		qp.enqueue(50);
	 	qp.enqueue(60);
	 	qp.isEmpty();
		qp.size();
		qp.front();
		qp.dequeue();-
	 	qp.enqueue(30);
		qp.enqueue(40);
		qp.enqueue(50);
	 	qp.enqueue(60);
	 	System.out.println(qp);
	 	qp.isEmpty();
		qp.size();
		qp.front();
		qp.dequeue();
		qp.isEmpty();
		qp.size();
		qp.front();
		qp.enqueue(50);
	 	qp.enqueue(60);
	 	qp.dequeue();
		qp.isEmpty();
		qp.size();
		qp.front();
		System.out.println(qp);
	} 
}