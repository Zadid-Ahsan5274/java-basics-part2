package exercises;

import java.util.Scanner;

public class ElementExistsOrNot {

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
			System.out.print("Enter an element to check: ");
			int a = input.nextInt();
			for (int i = 0; i < newArray.length; i++) {
				if (newArray[i] == a) {
					System.out.println(a + " exists in the array");
					break;
				}
			}

		} catch (Exception e) {
			System.out.println("Caught the exception..." + e);
		}

	}

}
