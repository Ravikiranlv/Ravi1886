package JAVA_TESTYANTRA;

import java.util.Scanner;

public class prime_number_0class {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			System.out.println("enter the no");	 
			int num = sc.nextInt();
		int count=0;
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			count=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				sum=sum+i;
			}
		}
		System.out.println("The sum of prime number within the range:"+sum);
	}
}
