package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class Factorial_program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int fact = 1;
		for (int i = a; i >= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of an number : " + fact);
	}

}
