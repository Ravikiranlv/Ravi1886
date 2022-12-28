package ARRAY_LOGICS;

import java.util.Scanner;

public class P1_FirstHeighest_SecondHeighest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i = 0; i <= b.length-1; i++) {
			for (int j = 0; j <=i; j++) {
				b[i] = sc.nextInt();
			}
		}
		// int [] number= {24,47,68,72,81,95};
		// System.out.println(number.length);
		int First_Heighest = 0;
		int Second_Heighets = 0;
		for (int i : b) {
			if (First_Heighest < i) {
				Second_Heighets = First_Heighest;
				First_Heighest = i;
			} else if (Second_Heighets < i) {
				Second_Heighets = i;
			}
		}
		System.out.println("First Max number : " + First_Heighest);
		System.out.println("Second Max Number : " + Second_Heighets);
	}

}
