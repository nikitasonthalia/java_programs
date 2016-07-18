package searching_sorting;

public class BinarySearch {

	static int binarySearch(int[] v,int min, int max,int key)
	{
		 if(min<max)
		 {
			 
			 int mid=(min+max)/2;
			// System.out.println("found at index : "+ mid);
			 if(v[mid]==key)
			 {
				// System.out.println("found ");
			
				 return mid;
				 
			 }
			 else if (key<v[mid]) {
				// System.out.println("lower half : ");
				
				return binarySearch(v,0,mid,key);
				
			}
			 else if(key>v[mid])
			 {
				 return binarySearch(v, mid+1, max, key);
			 }
			 
		 }
		 else
		 {
			 return -1; 
		 }
		 return -1;
		 
		//return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]={2,4,6,8,43,65};
		int index=binarySearch(v, 0, v.length-1, 46);
		if(index!=-1)
		{
			System.out.println("found at index : "+ index);
		}
//		for(int i=0;i<v.length;i++)
//		{
//			System.out.println(v[i]);
//		}
	}

}
