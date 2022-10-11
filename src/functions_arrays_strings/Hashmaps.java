package functions_arrays_strings;

import java.util.HashMap;

public class Hashmaps {

	public static void main(String[] args) {

		HashMap<String, String> capitalCities = new HashMap();
		// Add keys and values
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		System.out.println(capitalCities.get("USA"));

	}

}
