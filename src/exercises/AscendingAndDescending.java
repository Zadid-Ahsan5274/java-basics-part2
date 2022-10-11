package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class AscendingAndDescending {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			int[] newArray = new int[6];
			for (int i = 0; i < newArray.length; i++) {
				System.out.print("Enter array element: ");
				newArray[i] = input.nextInt();
			}
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
			System.out.println();
			Arrays.sort(newArray);
			System.out.println("Printing in ascending order...");
			for (int a : newArray) {
				System.out.print(a + " ");
			}
			System.out.println();
			System.out.println("Printing in descending order...");
			for (int i = newArray.length - 1; i >= 0; i--) {
				System.out.print(newArray[i] + " ");
			}
			System.out.println();
		} catch (Exception e) {
			System.out.println("Caught the exception..." + e);
		}
	}

}
