package java_program_in_softcopy_Nots;

/* Q:- 26. To find grade of the student.
 
O/p :- 
Enter the marks obtained by student : 
98
Distinction : 98

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Grade_of_the_Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks obtained by student : ");
		int marks = sc.nextInt();
		if (marks >= 85 && marks <= 100) {
			System.out.println("Distinction : " + marks);
		} else if (marks >= 60) {
			System.out.println("First class : " + marks);
		} else if (marks >= 50) {
			System.out.println("Second class : " + marks);
		} else if (marks >= 35) {
			System.out.println("Pass : " + marks);
		} else {
			System.out.println("Fail : " + marks);
		}
	}
}
