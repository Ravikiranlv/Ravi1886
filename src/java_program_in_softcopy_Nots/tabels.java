package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class tabels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber : ");
		int a = sc.nextInt();
		for (int i = 1; i <=10; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}
	}
}
