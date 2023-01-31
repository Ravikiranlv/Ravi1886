// 34. Swap two numbers using 3 rd. variable.

/*
 o/p:- 
Enter the Number : 
10
20
The swap of A is: 20
The swap of B is : 10
  
  
 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class swap_number_using_third_variable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = a;
		a = b;
		b = temp;
		System.out.println("The swap of A is: " + a);
		System.out.println("The swap of B is : " + b);
	}

}
