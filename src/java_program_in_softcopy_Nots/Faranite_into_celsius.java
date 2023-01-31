//31. To convert the temperature in Fahrenheit into Celsius

/*
o/p:-
Enter the Fahrenheit : 
2
Celsius-30.88888888888889

*/
package java_program_in_softcopy_Nots;

import java.util.Scanner;

/**
 * 
 * @author ravik
 *
 */
public class Faranite_into_celsius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Fahrenheit : ");
		double fahrenheit = sc.nextDouble();
		double celsius = ((5.0 / 9.0) * fahrenheit - 32.0);
		System.out.println("Celsius" + celsius);
	}	
}
