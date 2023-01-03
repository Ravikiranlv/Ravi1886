package java_program_in_softcopy_Nots;
/*
Q:- 19. To reverse a String using For loop.

Enter the String : 
ravikiran lv
vl narikivar

 */
import java.util.Scanner;
/**
 * 
 * @author ravik
 *
 */
public class reverseString_using_forloop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a=sc.nextLine();
		String b="";
		for(int i=a.length()-1;i>=0;i--)
		{
			 b=b+a.charAt(i);
		}
		System.out.println(b);
	}

}
