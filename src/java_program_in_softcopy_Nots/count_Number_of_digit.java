package java_program_in_softcopy_Nots;
/*
Q:-11. To count the number of digits in a given number.

Enter the Number : 
784
counr of Number : 3

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class count_Number_of_digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a=sc.nextInt();
		int count=0;
		while(a!=0) {
			a=a/10;
			count++;
		}
		System.out.println("counr of Number : "+count);
	}
}
