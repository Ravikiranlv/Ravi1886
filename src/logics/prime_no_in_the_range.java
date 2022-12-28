//WAP to print count of even and odd numbers in the range 1 to 100

package logics;
public class prime_no_in_the_range 
{
	public static void main(String[] args) 
	{
		int count=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				count++;
			}
		}
		System.out.println("count of even number is"+" "+count);
		System.out.println("******************");
		int count1 = 0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==1)
			{
				count1++;
			}
		}
		System.out.println("count of odd number is"+" "+count1);
	}
}
