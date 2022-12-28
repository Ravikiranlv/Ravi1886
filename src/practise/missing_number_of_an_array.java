//42. to find missing number from the array
package practise;
/**
 * 
 * @author ravikiran
 *
 */
public class missing_number_of_an_array {
	public static void main(String[] args) {
		int[] arr1 = { 7, 5, 6, 1, 4, 2 };
		System.out.println("Missing number from array arr1 : " + MissingNumber(arr1));
		int[] arr2 = { 5, 3, 1, 2 };
		System.out.println("Missing number from array arr2 : " + MissingNumber(arr2));
	}

	public static int MissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int remsum = 0;
		for (int i = 0; i < arr.length; i++) {
			remsum += arr[i];
		}
		int MissingNumber = sum - remsum;
		return MissingNumber;
	}

}



//o / p 
//Missing number from array arr1 : 3
//Missing number from array arr2 : 4