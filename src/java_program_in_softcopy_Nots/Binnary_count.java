package java_program_in_softcopy_Nots;
/*
 Q:- 10. To check or count how many Binary digit are present in given number
 
O/P:-
Enter the Number : 
58
0
	
 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class Binnary_count {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int count = 0;
		while (a != 0) {
			int rem = a % 10;
			if (rem == 0 || rem == 1) {
				count++;
			}
			a = a / 10;
		}
		System.out.println(count);
	}
} 