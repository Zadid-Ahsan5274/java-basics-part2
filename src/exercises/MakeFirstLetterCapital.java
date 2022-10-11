package exercises;

public class MakeFirstLetterCapital {

	public static void main(String[] args) {

		String str = "i live in bangladesh";
		String newString[] = str.split(" ");
		for (int i = 0; i < newString.length; i++) {
			String firstLetter = String.valueOf(newString[i].charAt(0)).toUpperCase();
			String othersLetter = newString[i].substring(1);
			System.out.print(firstLetter + othersLetter);
		}

	}

}
