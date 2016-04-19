package data_structure;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;



public class ExpEval {
	
		
	public static float evalute(String exp)
	{
		char[] token = exp.toCharArray();
		Stack values = new Stack();
		Stack op=	new Stack();
		
		
		for(int i=0;i<token.length;i++)
		{
			if(token[i] >= '0'&& token[i] <='9')
			{
				String s= "";
				while(i<token.length && token[i] >= '0'&& token[i] <='9')
				{
					s=s+token[i];
					i++;
					
					
				}
				
				values.push(Integer.parseInt(s));
				i--;
			}
			else if(token[i]=='(')
			{
				
				op.push(token[i]);
			}
			else if(token[i]==')')
			{
				
				while((char)op.peek()!='(')
				{
					
					int val=exp((int)values.pop(),op.pop().toString(),(int)values.pop());
					values.push(val);
				}
				op.pop();
			}
			
			else if (token[i] == '+' || token[i] == '-' || token[i] == '*' || token[i] == '/') 
			{
				
				while((!op.empty()) && hasPrecedance((char) op.peek(),token[i]) )
					{
					
						int val=exp((int)values.pop(),op.pop().toString(),(int)values.pop());
						values.push(val);
					
					}
				
				op.push(token[i]);
				

			}
			
			
		}
		
		while(!op.empty())
		{
			int val=exp((int)values.pop(),op.pop().toString(),(int)values.pop());
			values.push(val);
		}
//		for(int j=0; j<token.length;j++)
//			System.out.println(token[j]);
		return Float.parseFloat(values.peek().toString());
		
	}
	
	private static boolean hasPrecedance(char op1, char op2) 
	{
		
		Map <Character, Integer> priorities = new HashMap<Character, Integer>();
		priorities.put('^', 3);
		priorities.put('/', 2);
		priorities.put('*', 2);
		priorities.put('+', 1);
		priorities.put('-', 1);
		priorities.put('#', 0);
		// TODO Auto-generated method stub
		if(op1=='(' || op1==')')
		{
			return false;
		}
		if(priorities.get(op1) >= priorities.get(op2))
			return true;
		else
			return false;
	}

	public static int exp(int op1,String op, int op2)
	{
		switch(op)
		{
		case "+":
			return op1+op2;
		case "-":
			return op1-op2;
		case "*":
			return op1*op2;
		case "/":
			return op1/op2;
		}
		return 0 ;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(evalute("1+(20*2)+4"));
		
		
		//System.out.println(hasPrecedance("/", "+"));
		
		
	}

}
