//30. To find the square and cube of a number .

package java_program_in_softcopy_Nots;

/*
 o/p:-
 
Enter the number : 
5
Square of an number is : 25
cube of an numbr is : 125

 */
import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class square_and_cube_of_an_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		int b = a * a;
		int c = a * a * a;
		System.out.println("Square of an number is : " + b);
		System.out.println("cube of an numbr is : " + c);
	}

}
