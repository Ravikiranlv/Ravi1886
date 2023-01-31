// 8. To check whether given number is a Armstrong no or not

/*o/p:-

    O/P:-Enter the Number : 
	242
	It is not a Armstrong Number : 242
*/

package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class armstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int copy = a;
		int sum = 0;
		while (a != 0) {
			int rem = a % 10;
			sum = sum + (rem * rem * rem);
			a = a / 10;	
		}
		if (sum == copy) {
			System.out.println("It is  a Armstrong Number : " + copy);
		} else {
			System.out.println("It is not a Armstrong Number : " + copy);
		}
	}

}
