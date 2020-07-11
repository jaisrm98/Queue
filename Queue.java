package Queue;

public class Queue {
	Node rear,front;
	Queue()
	{
		front=rear=null;
	}
	public class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.
			data=data;
			next=null;
		}
	}
	public void Enqueue(int data)
	{
		Node temp=new Node(data);
		if(rear==null)
		{
			rear=front=temp;
			
		}
		rear.next=temp;
	   rear=temp;
		System.out.println(data);
		
	}
	public void Dequeue()
	{
	if(front==null)
		System.out.println("underflow");
	int k=front.data;
       front = front.next;
	System.out.println("removed is "+k);
	
	
	}
	
	
	 public static void main(String[] args) 
	    {
	
	Queue obj=new Queue();
	obj.Enqueue(10);
	obj.Enqueue(20);
	obj.Enqueue(30);
	obj.Enqueue(40);
	obj.Enqueue(50);
	obj.Enqueue(60);
	obj.Dequeue();
	obj.Dequeue();
	System.out.println("front is "+obj.front.data);
	System.out.println("rear is "+obj.rear.data);
	

}
}
