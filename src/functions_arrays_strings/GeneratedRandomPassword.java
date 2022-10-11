package functions_arrays_strings;

import java.util.Random;

public class GeneratedRandomPassword {

	public static String generateRandomPassword(int len) {
		String password = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghi" + "jklmnopqrstuvwxyz!@#$%&";
		Random rnd = new Random();
		StringBuilder sb = new StringBuilder(len);
		for (int i = 0; i < len; i++)
			sb.append(password.charAt(rnd.nextInt(password.length())));
		return sb.toString();
	}

	public static void main(String[] args) {
		String password = generateRandomPassword(8);
		System.out.println(password);

	}

}
