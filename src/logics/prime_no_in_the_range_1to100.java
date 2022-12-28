//WAP to print count of even and odd numbers in the range 1 to 100

package logics;
public class prime_no_in_the_range_1to100
{
	public static void main(String[] args) 
	{
		int count1=0;
		int count2=0;
		for(int i=1;i<=100;i++)
		{
			if(i%2==0)
			{
				count1++;
			}
			if(i%2==1)
			{
				count2++;
			}
		}
		System.out.println(count1);
		System.out.println(count2);
	}

}
