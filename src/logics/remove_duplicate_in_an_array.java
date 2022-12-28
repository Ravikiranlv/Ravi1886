//WAP to remove duplicate in an array int[] arr={1,2,4,5,2,5,4}

package logics;

import java.util.LinkedHashSet;

public class remove_duplicate_in_an_array 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,4,5,2,5,4};
		LinkedHashSet<Integer> l=new LinkedHashSet<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			l.add(arr[i]);
		}
		System.out.println(l);
		
	}

}
