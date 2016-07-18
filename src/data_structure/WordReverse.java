package data_structure;

import java.lang.reflect.Array;
import java.util.Iterator;

public class WordReverse {
	
	String[] wordReverse(String s)
	{
		String p = "\\s+";
		String temp;
		String sw[];
		sw=s.split(p);
		int l=sw.length-1;
		System.out.println(sw.length);
		for (int i = 0; i < sw.length/2; i++) {
			temp=sw[i];
			sw[i]=sw[l];
			sw[l]=temp;
			l--;
			//System.out.println(sw[i]);
			
		};
		
		
		return sw;
		
	}
	String reverseString(String s)
	{
		String p = "";
		String[] sw;
		sw=s.split(p);
		int l=sw.length-1;
		String ss="";
		System.out.println(sw.length);
		for (int i = l; i>=0; i--) {
			ss+=sw[i];
		}
		
		return ss;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordReverse w=new WordReverse();
		String s = "my name is nikita";
		System.out.println(w.reverseString(s));
		
		String sw[] = w.wordReverse(s);
		for (int i = 0; i < sw.length; i++) {
			System.out.println(sw[i]);
		}
		
	}

}
