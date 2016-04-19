package data_structure;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Sinple_Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linklist=new LinkedList<String>();
		linklist.add("nikita");
		linklist.add("viksgh");
		linklist.add("ram");
		
		linklist.addFirst("vinaod");
		
		ListIterator<String> i = linklist.listIterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	
		

}
