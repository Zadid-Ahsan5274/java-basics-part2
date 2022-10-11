package exercises;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		try {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter a string: ");
			String str = input.nextLine();
			char[] charString = str.toCharArray();
			String reverseString = "";
			for (int i = charString.length - 1; i >= 0; i--) {
				reverseString = reverseString + charString[i];
			}
			System.out.println(reverseString);
		} catch (Exception e) {
			System.out.println("Please enter a string " + e);
		}

	}

}
