package java_program_in_softcopy_Nots;

import java.util.Random;

/**
 * 
 * @author ravik
 *
 */
public class randomNumber {
	public static void main(String[] args) {
		Random r=new Random();
		System.out.println("Random number are: ");
		for(int i=1;i<=5;i++)
		{
			System.out.print(r.nextInt(10));
		}
	}
}
