//WAP to convert decimal Number into Binary Number 

/*
Enter the deciml Number :
18
Binary Number is : 
10010

 */
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class convert_decimalNumber_to_Binary_Number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the deciml Number :");
		int a = sc.nextInt();
		int arr[] = new int[20];
		int i = 1;
		while (a != 0) {

			arr[i++] = a % 2;
			a = a / 2;
		}
		System.out.println("Binary Number is : ");
		for (int j = i - 1; j > 0; j--) {
			System.out.print(arr[j]);
		}
		System.out.println();
	}
}
