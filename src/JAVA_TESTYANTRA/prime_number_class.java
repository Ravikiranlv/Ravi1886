package JAVA_TESTYANTRA;

import java.util.Scanner;

public class prime_number_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			if(isPrime(i)==true)
			{
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
	private static boolean isPrime(int i)
	{
		if(i==1)
	    return false;
		for(int j=2;j<=i/2;j++)
		{
			if(i%2==0)
			{
				return false;
			}
		}
		return true;
	}

}
