package exercises;

import java.util.Scanner;

public class CharactersAndWordsCount {

	public static void main(String[] args) {

		try {
			Scanner user_input = new Scanner(System.in);
			System.out.print("Please say something: ");
			String str = user_input.nextLine();
			System.out.println("Characters count: " + str.length());
			String[] newString = str.split(" ");
			System.out.println(newString.length);
		} catch (Exception e) {
			System.out.println("Please enter a string " + e);
		}

	}

}
