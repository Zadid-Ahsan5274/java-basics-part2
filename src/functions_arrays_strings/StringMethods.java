package functions_arrays_strings;

public class StringMethods {

	public static void main(String[] args) {

		// String str = " i live in bangladesh. i am a boy ";
		String str = "I live in bangladesh";
		/*
		 * String str2 = "Dhaka"; // String[] words = str.split(" ");
		 * System.out.println(str.length()); char a[] = str.toCharArray();
		 * System.out.println(a[5]); System.out.println(str.charAt(7));
		 * System.out.println(str.indexOf("b")); System.out.println(str.indexOf("i"));
		 * System.out.println(str.indexOf("I"));
		 * System.out.println(str2.contains("dhaka"));
		 * System.out.println(str2.equals("dha"));
		 * System.out.println(str.equals("live"));
		 * System.out.println(str.contains("live"));
		 * System.out.println(str.replace("bangladesh", "dhaka")); //
		 * System.out.println(words[3]);
		 * System.out.println(str.substring(str.indexOf("l"),
		 * str.indexOf(".")).toUpperCase()); System.out.println(str.trim());
		 */
		System.out.println(str.length());
		String words[] = str.split(" ");
		System.out.println(words.length);
	}

}
