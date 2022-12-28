//45. To find whether the number is positive or negative .

package practise;

import java.util.Scanner;

public class Check_the_given_number_is_positive_or_Negetive {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number : ");
		int num = sc.nextInt();
		if (num > 0) {
			System.out.println(num + " :number is positive ");
		} else if (num < 0) {
			System.out.println(num + " :Number is negetive");
		}
	}

}

// o/p = Enter the Number : 
//      -47
//      -47 :Number is negetive