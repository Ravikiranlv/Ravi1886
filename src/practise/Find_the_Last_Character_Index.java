//How to Find the Last Character Index from String Using lastIndexOf()?

package practise;

import java.util.Scanner;

public class Find_the_Last_Character_Index {
	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter the String :");
		//String jk = sc.nextLine();
		String jk="Testyantra Company is nearrer to Banglore india";
		
		System.out.println("Basic LastIndexOf()  example");
		System.out.println("char 'a' last occurence:"+jk.lastIndexOf("a"));
		System.out.println("String\"nearrer\" at last occurance :"+jk.lastIndexOf("nearrer"));
		System.out.println("First occurance of char 'a' from 41 index backword :"+jk.lastIndexOf('a', 41));
		System.out.println("First occurance of string \"nearrer\" from 43 index backwords :"+jk.lastIndexOf("nearrer", 43));
	}

}
