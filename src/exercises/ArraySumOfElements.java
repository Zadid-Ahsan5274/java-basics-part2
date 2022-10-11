package exercises;

import java.util.Scanner;

public class ArraySumOfElements {

	public static void main(String[] args) {
		try {
			Scanner input = new Scanner(System.in);
			int[] newArray = new int[6];
			int sum = 0;
			for (int i = 0; i < newArray.length; i++) {
				System.out.print("Enter array element: ");
				newArray[i] = input.nextInt();
			}
			for (int i = 0; i < newArray.length; i++) {
				System.out.println(newArray[i] + " ");
			}
			for (int i = 0; i < newArray.length; i++) {
				sum = sum + newArray[i];
			}
			System.out.println("Sum of the array elements: " + sum);
		} catch (Exception e) {
			System.out.println("Please enter valid integer " + e);
		}
	}

}
