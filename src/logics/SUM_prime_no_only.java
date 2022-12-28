//WAP to SUM the prime number only from range 1 to 100

package logics;
public class SUM_prime_no_only 
{
	public static void main(String[] args)
	{
		int sum=0;
	for(int j=2;j<=100;j++)
	{
		int no = j;
		boolean	flag=false;
		for(int i=2;i<no;i++) 
		{
			int count=0;
			if(no%i==0)
			{
			flag=true;
			count++;
			break;
			}
		}    
	if(flag==false)
	 {
		sum=sum+no;
	 }
   }
	System.out.println("The sum of prime number from 1 to 100 is"+" "+sum);
 }
}
