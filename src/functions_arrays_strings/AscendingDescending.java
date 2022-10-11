package functions_arrays_strings;

import java.util.Arrays;

public class AscendingDescending {

	public static void main(String[] args) {
		
		int arr[] = {3,5,8,2,9};
		Arrays.sort(arr);
		System.out.println("-----Ascending Order-----");
		for(int a:arr) {
			System.out.println(a);
		}
		System.out.println("-----Descending Order-----");
		for(int i = arr.length - 1; i >= 0;i--) {
			System.out.println(arr[i]);
		}
	}

}
