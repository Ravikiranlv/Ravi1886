package practise;

import java.util.Arrays;
import java.util.Scanner;

public class Sorted_an_array {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the Number : ");
		//int a=sc.nextInt();
		//int b[]=new int [a];
		//for(int j=1;j<=a;j++)
		//{
			//b[j]=sc.nextInt();
		//}
		int b[]= {22,4,88,4,25,0,4};
		for(int i=0;i<b.length;i++)
		{
			for(int j=i+1;j<b.length;j++)
			{
			if(b[i]>b[j])
			{
				int temp=b[i];
				b[i]=b[j];
				b[j]=temp;
			}
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]+" ");
		}
	}

}
