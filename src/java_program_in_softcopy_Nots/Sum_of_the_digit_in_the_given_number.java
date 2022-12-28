package java_program_in_softcopy_Nots;
/*
7. To find sum of digits of a given number.

Enter the Number : 
45
Sum of the digits in a given number is : 9
 
 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class Sum_of_the_digit_in_the_given_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		int sum=0;
		while(a!=0)
		{
			int rem=a%10;
			sum=sum+rem;	
			a=a/10;
		}
		System.out.println("Sum of the digits in a given number is : "+sum);
	}
}
