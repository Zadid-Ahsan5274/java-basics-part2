package exercises;

import java.util.Scanner;

public class NumberOfNotes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Number of notes available: [1000, 500, 100, 50, 20,10, 5, 2, 1]");
		int amount = input.nextInt();
		int countof1000 = 0;
		int countof500 = 0;
		int countof100 = 0;
		int countof50 = 0;
		int countof20 = 0;
		int countof10 = 0;
		int countof5 = 0;
		int countof2 = 0;
		int countof1 = 0;
		int choice;
		if (amount == 1) {
			countof1++;
			System.out.println("You need " + countof1 + " number of notes");
		} else if (amount == 2) {
			System.out.print("Which note you want to take? ");
			choice = input.nextInt();
			if (choice == 1) {
				countof1 = countof1 + 1;
				System.out.println("You need " + countof1 + " number of notes");
			} else if (choice == 2) {
				countof2++;
				System.out.println("You need " + countof2 + " number of notes");
			}
		}

	}

}
