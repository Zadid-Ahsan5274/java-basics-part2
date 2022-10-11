package exercises;

import java.util.Scanner;

public class PrintArrayElements {

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
		} catch (Exception e) {
			System.out.println("Please enter valid integer " + e);
		}
	}

}
