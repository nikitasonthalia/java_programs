package data_structure;

public class StripWhilespace {
	
	String stripspace(String s)
	{
		String ss="";
		for (int i = 0; i < s.length(); i++) {
			
			if(s.substring(i,i+1).equals(" "))
			{
				
//				System.out.println(i);
//				for (int j = i; j < s.length()-1; j++) {
//					s+=
//					//s.replace(s.substring(j,j+1), s.substring(j+1,j+2));
//					
//				}
			}
			else
			{
				ss+=s.substring(i,i+1);
			}
			
		}
		return ss;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StripWhilespace swp=new StripWhilespace();
		String s= "I am nikita.";
		System.out.println(swp.stripspace(s));
	}

}
