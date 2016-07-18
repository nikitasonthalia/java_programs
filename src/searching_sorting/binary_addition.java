package searching_sorting;

public class binary_addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,0,0,1};
		int b[]={0,0,0,1};
		int[] c = {0,0,0,0,0};
		int sum=0;
		for(int i =0;i<a.length;i++)
		{
			sum=a[i]+b[i]+c[i];
			c[i]=sum%2;
			c[i+1]=sum/2;
			
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		
		

	}

}
