package java_program_in_softcopy_Nots;

import java.util.Scanner;

public class check_number_is_odd_or_even {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("It is a even number : " + a);
		} else if(a%2==1){
			System.out.println("It is a odd number : " + a);
		}
	}
}
