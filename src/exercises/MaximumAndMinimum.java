package exercises;

import java.util.Scanner;

public class MaximumAndMinimum {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			int[] newArray = new int[6];
			int max = newArray[0];

			for (int i = 0; i < newArray.length; i++) {
				System.out.print("Enter array element: ");
				newArray[i] = input.nextInt();
			}
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
			System.out.println();

			for (int i = 1; i < newArray.length; i++) {
				if (max < newArray[i]) {
					max = newArray[i];
				}
			}

			int min = newArray[0];

			for (int i = 1; i < newArray.length; i++) {
				if (min > newArray[i]) {
					min = newArray[i];
				}
			}
			System.out.println("max element is " + max);
			System.out.println("min element is " + min);

		} catch (Exception e) {
			System.out.println("Please enter valid integer " + e);
		}

	}

}
