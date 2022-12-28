//WAP to print SUM of non prime number only in a given range from 1to 100

package logics;
public class sum_of_only_non_prime_no
{
	public static void main(String[] args)
	{
		int sum=0;
		for(int j=2;j<=100;j++)
		{
			int no=j;
			boolean flag=false;
			for(int i=2;i<=no;i++)
			{
				if(no%i==0)
				{
					flag=true;
					break;
				}
			}
			if(flag==true)
			{
				sum=sum+no;
			}
		}
		System.out.println("The sum of non prime number in a given range from 1to100 is"+" "+sum);
	}
}
