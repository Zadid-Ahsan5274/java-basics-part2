package functions_arrays_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {

	public static boolean isValid(String password) {
		String regex = "^(?=.*[0-9])" + "(?=.*[a-z])(?=.*[A-Z])" + "(?=.*[@#$%^&+=])" + "(?=\\S+$).{8,20}$";
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(password);
		return m.matches();
	}

	public static void main(String[] args) {

	}

}
