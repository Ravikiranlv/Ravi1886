package JAVA_TESTYANTRA;

import java.util.Scanner;

public class tcs_interview_question {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("eneter the first number : ");
		int a = sc.nextInt();
		System.out.println("Eneter the Second Number : ");
		int b = sc.nextInt();
		System.out.println("Enter the how many times it shouls be repetaed :  ");
		int c = sc.nextInt();
		System.out.println(a + " " + b);
		for (int i = 1; i < c; i++) {
			a = a * 2;
			b = b * 3;
			System.out.println(a + "  " + b);
		}
	}
}
