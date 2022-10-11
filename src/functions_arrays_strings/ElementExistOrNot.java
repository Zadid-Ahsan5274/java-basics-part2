package functions_arrays_strings;

import java.util.Scanner;

public class ElementExistOrNot {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 3, 4, 3, 5, 6, 7, 5 };
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a) {
				System.out.println("Number exists in the array");
				break;
			}
		}

	}

}
