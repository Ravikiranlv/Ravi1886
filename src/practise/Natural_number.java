//43. To find Natural number.

package practise;

import java.util.Scanner;

public class Natural_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the natural number : ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=0;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of natural number is : "+sum);
	}
}

// o/p =Enter the natural number : 
//        3
//      Sum of natural number is : 6