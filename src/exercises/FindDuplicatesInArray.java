package exercises;

import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			int[] newArray = new int[10];
			for (int i = 0; i < newArray.length; i++) {
				System.out.print("Enter array element: ");
				newArray[i] = input.nextInt();
			}
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + " ");
			}
			System.out.println();
			for (int i = 0; i < newArray.length; i++) {
				for (int j = i + 1; j < newArray.length; j++) {
					if (newArray[i] == newArray[j]) {
						System.out.println(newArray[i]);
					}
				}
			}
		} catch (Exception e) {
			System.out.println("caught the exception..." + e);
		}

	}

}
