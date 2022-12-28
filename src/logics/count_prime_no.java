//WAP to print count of prime no from 1to100

package logics;
public class count_prime_no 
{
	public static void main(String[] args)
	{
		int count=0;
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
				count++;
			}
		}
		System.out.println("the count of prime no is"+" "+count);
		
	}

}
