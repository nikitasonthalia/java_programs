package data_structure;

public class DuplicateString {

	String removeDuplicate(String s)
	{
		String ss=s.substring(0,1);
		String ch=s.substring(0,1);
		for (int i = 1; i < s.length(); i++) {
			
			
			if(s.substring(i,i+1).equals(ch))
			{
				//System.out.println(ch);
				
				//s=s.replaceAll(ch, "");
				//System.out.println(s);
				//ch=s.substring(i,i+1);
			}
			else
			{
				
				ch=s.substring(i,i+1);
				//System.out.println(ch);
				ss+=s.substring(i,i+1);
			}
		}
		
		return ss;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateString swp=new DuplicateString() ;
		String s= "AAA BB ccc";
		
		System.out.println(swp.removeDuplicate(s));
	}

}
