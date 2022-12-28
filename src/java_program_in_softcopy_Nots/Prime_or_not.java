package java_program_in_softcopy_Nots;
/*

Enter the Number: 
24
It is not a prime number : 24

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class Prime_or_not {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a=sc.nextInt();
		boolean flag=true;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				flag=true;
				break;
			}
		}
			if(flag==false)
			{
				System.out.println("It is a Prime Number : "+a);
			}
			else
			{
				System.out.println("It is not a prime number : "+a);
			}
		
	}

}
