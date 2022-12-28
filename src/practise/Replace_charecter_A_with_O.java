package practise;

import java.util.Scanner;

public class Replace_charecter_A_with_O {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String s = sc.nextLine();
		char[] s2 = s.toCharArray();
		String s3 = "";
		for (int i = 0; i < s2.length; i++) {
			if (s2[i] == 'a') {
				s3 = s3 + 'o';
			} 
			else if(s2[i]=='l')
			{
				s3=s3+'n';
			}
			else {
				s3 = s3 + s2[i];
			}
		}
		System.out.println(s3);
	}
}
// o/p = Enter the String : 
//       java hello java
//       jovo hello jovo
