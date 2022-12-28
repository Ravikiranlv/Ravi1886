package practise;

import java.util.Scanner;

public class reverse_String {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String o = sc.nextLine();
		//String s1 = "My name is ram";
		String[] arr = o.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
