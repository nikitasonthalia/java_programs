package data_structure;

public class StackMin {
	public static void main(String[] args) {
		
		
		MyStack1 s=new MyStack1(10);
		s.push(12);
		s.push(13);
		System.out.println(s.minPeek());
		System.out.println(s.pop());
		System.out.println(s.minPeek());
		s.push(11);
		s.push(14);
		System.out.println(s.minPeek());
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.minPeek());
		
		
		
		
		
	}
	
}

class MyStack1
{
	int top,mintop;
	Object[] stack;
	int len;
	Object[] min;
	
	
	public MyStack1(int n) {
		// TODO Auto-generated constructor stub
		top=-1;
		stack=new Object[n];
		len=n;
		min=new Object[n];
		mintop=-1;
		
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;

	}
	boolean isFull()
	{
		if(top==len-1)
		{
			return true;
		}
		else
			return false;
	}
	
	void push(Object data)
	{
		if(this.isFull())
			return;
		else
		{
			if(mintop==-1)
			{
				min[++mintop]=data;
			}
			else
			{
				Object no=this.minPeek();
				if(Integer.parseInt(no.toString()) <= Integer.parseInt(data.toString()))
				{
					min[++mintop]=no;
					
					
				}
				else
				{
					min[++mintop]=data;
				}
			}
			stack[++top]=data;
			
		}
	}
	Object pop()
	{
		if(this.isEmpty())
			return null;
		else{
			mintop--;
			return stack[top--];
		}
	}
	Object minPeek()
	{
		return(min[mintop]);
	}
	
	
}