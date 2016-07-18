package data_structure;

public class core_stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyStack s=new MyStack(5);
		s.push(2);
		s.push(3);
		s.push(5);
		s.push(4);
		s.push(6);
		if(! s.isfull())
		{
			s.push(1);
		}
		System.out.println("---------------------");
		while(! s.isEmpty())
		{
			System.out.println(s.peek());
			System.out.println(s.topValue());
			s.pop();
			
		}
		
		

	}

}

class MyStack
{
	Object data[];
	int max;
	int top;
	
	public MyStack(int no) {
		max=no;
		data=new Object[max];
		top=-1;
		
	}
	
	void push(Object value)
	{
		data[++top]=value;
	}
	
	void pop()
	{
		top--;
		
	}
	Object peek()
	{
		int n=top;
		
		return data[n];
	}
	boolean isEmpty()
	{
		return top==-1;
	}
	int topValue()
	{
		return top;
	}
	boolean isfull()
	{
		return top==--max;
	}
	
	
	
	
}
