package practise;

public class sorted_in_an_array {
	public static void main(String[] args) {
		int a[]= {10, 55, 4, 5, 7, 8, 21, 20, 5, 7, 0, 10};
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
