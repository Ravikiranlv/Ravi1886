//WAP to sort an array int[] arr={2,3,4,5,1,6,7};

package logics;
public class bubble_sort 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,5,1,6,7};
		int a=arr.length;
		for(int i=0;i<a-1;i++)
		{
			for(int j=0;j<a-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<a;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}
