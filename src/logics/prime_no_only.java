//WAP to print prime number only in a given range from 1to100

package logics;

import java.util.Scanner;

public class prime_no_only 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Nuber : ");
		int s = sc.nextInt();
		
		int sum=0;
		for(int j=2;j<=100;j++)
		{
			int no=j;
			boolean flag=false;
			for(int i=2;i<no;i++)
			{
				if(no%i==0)
				{
				flag=true;
				break;
			    }
			}
		  if(flag==false)
		   {
			System.out.println(j+" "+"is the prime number");
		   }
		}
	}

}
