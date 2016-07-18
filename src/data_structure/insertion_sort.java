package data_structure;

import java.util.Vector;

public class insertion_sort {
//	static int[] insertionsort(int[] v, int sval)
//	{
//		int index = 0;
//		for(int i=1; i<v.length;i++)
//		{
//			
//			int key=v[i];
//			int j=i-1;
//			while(j>=0 && v[j]>key )
//			{
//				
//				v[j+1]=v[j];
//				j--;
//			}
//			v[j+1]=key;
////			if(key==sval)
////			{
////				index=j+1;
////			}
//			
//			
//		}
////		for(int i=0;i<v.length;i++)
////		{
////			
////			System.out.println(v[i]);
////		}
//		//System.out.println("search value at " + index);
//		return v;
//		
//	}
	static void insertionsort(int[] v,int len)
	{
		if(len>=0)
		{
			insertionsort(v,len-1);
			int temp=len-1;
			int key=v[len];
			while(temp>=0 && v[temp]>key)
			{
				v[temp+1]=v[temp];
				temp--;
			}
			v[temp+1]=key;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int v[]={21,4,2,6,32,12};
		insertionsort(v,v.length-1);
		for(int i=0;i<v.length;i++)
		{
			System.out.println(v[i]);
		}
	}
	

}
