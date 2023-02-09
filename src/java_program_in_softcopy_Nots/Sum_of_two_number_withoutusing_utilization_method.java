// Write the program to sum of two number with out using utilization "+" method
/*
 20

 */

package java_program_in_softcopy_Nots;

/**
 * 
 * @author ravik
 *
 */
public class Sum_of_two_number_withoutusing_utilization_method {
	static int add(int a, int b) {
		for (int i = 1; i <= b; i++) {
			a++;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = add(10, 10);
		System.out.println(a);
	}
}
