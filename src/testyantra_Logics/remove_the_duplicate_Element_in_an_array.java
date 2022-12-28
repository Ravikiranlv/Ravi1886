package testyantra_Logics;

public class remove_the_duplicate_Element_in_an_array {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 8 };
		int no = arr.length;
		int temp[] = new int[arr.length];
		int j = 0;
		for (int i = 0; i < no - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[no - 1];
		for (int k = 0; k < j; k++) {
			System.out.println(temp[k]);
		}
	}
}
