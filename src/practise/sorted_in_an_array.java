package practise;

public class sorted_in_an_array {
	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4,5,5,6,7,7,9,10};
		int k=0;
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]!=a[i+1])
			{
				a[k]=a[i];
				k++;
			}
		}
		a[k]=a[a.length -1];
		for(int i=0;i<=k;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
