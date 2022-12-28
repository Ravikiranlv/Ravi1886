package testyantra_Logics;

public class Sort_an_array {
	public static void main(String[] args) {
		int [] arr= {4,7,9,2,1,0,56,100};
		int k = arr.length;
		for(int i=0;i<=k-1;i++)
		{
			for(int j=0;j<k-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<k;i++)
		{
			System.out.print(arr[i]+" ");
		}
	} 

}
