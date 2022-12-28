package testyantra_Logics;

import java.util.Arrays;

public class Sortan_array_in_testyantra {
	public static void main(String[] args) {
		int a[]= {10,7,0,4,7,77,55,102,1,5,16};
	    Arrays.sort(a);
	    int k=0;
	    for(int i=0;i<a.length-1;i++)
	    {
	    	if(a[i]!=a[i+1])           
	    		
	    	{
	    		a[k]=a[i];
	    		k++;
	    	}
	    }
	    a[k]=a[a.length-1];
	    for(int i=0;i<=k;i++)
	    {
	    	System.out.print(a[i]+" ");
	    }
	}

}
