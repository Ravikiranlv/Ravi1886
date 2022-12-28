//49. To find the character position in the String.

package practise;

import java.util.Scanner;

public class Charecter_position_of_an_String {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Charecter : ");
		String s1 = sc.nextLine();
		char[] s2 = s1.toCharArray();
		for (int i = 0; i < s2.length; i++) {
			char ch = s1.charAt(i);
			System.out.println("Charecter position :" + i + " " + "position" + " " + ch);
		}
	}
}
// o/p  = Enter the Charecter : 
//        hello welcome to java
//        Charecter position :0 position h
//        Charecter position :1 position e
//        Charecter position :2 position l
//        Charecter position :3 position l
//        Charecter position :4 position o
//        Charecter position :5 position  
//        Charecter position :6 position w
//        Charecter position :7 position e
//        Charecter position :8 position l
//        Charecter position :9 position c
//        Charecter position :10 position o
//        Charecter position :11 position m
//        Charecter position :12 position e
//        Charecter position :13 position  
//        Charecter position :14 position t
//       Charecter position :15 position o
//       Charecter position :16 position  
//       Charecter position :17 position j
//        Charecter position :18 position a
//       Charecter position :19 position v
//        Charecter position :20 position a
