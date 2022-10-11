package functions_arrays_strings;

import java.util.ArrayList;

public class ArrayLists {

	public static void main(String[] args) {

		/*
		 * int num[] = new int[4]; num[0] = 34; num[2] = 35; for (int a : num) {
		 * System.out.println(a); }
		 */

		ArrayList<String> fruits = new ArrayList<>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Litchi");
		fruits.add("Jackfruit");
		fruits.add("Guava");
		fruits.remove(2);
		// fruits.add(2,"Pineapple");
		System.out.println(fruits);
		String[] arr = fruits.toArray(new String[0]); // converting ArrayList to Array
		System.out.println(arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[2]);
	}

}
