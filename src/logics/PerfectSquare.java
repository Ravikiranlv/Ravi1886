package logics;

public class PerfectSquare {

	public static void main(String[] args) {
		// Set the upper limit for the range of numbers to check
		int upperLimit = 100;

		// Iterate through the numbers from 1 to the upper limit
		for (int i = 1; i <= upperLimit; i++) {
			// Check if the number is a perfect square
			double squareRoot = Math.sqrt(i);
			if (squareRoot == (int) squareRoot) {
				// If it is a perfect square, print it
				System.out.println(i);
			}
		}
	}
}