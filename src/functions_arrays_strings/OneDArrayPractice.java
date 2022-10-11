package functions_arrays_strings;

import java.util.Arrays;

public class OneDArrayPractice {

	public static void main(String[] args) {
		
		// Arrays[] number = new Arrays[6];
		// Arrays num[] = new Arrays[]{};
		int num[] = {4,5,6,8};
		// System.out.println(num[2]); 
		System.out.println("Length of the array: "+num.length);
        /* for(int i = 0; i < num.length; i++) {
        	System.out.println(num[i]);
        } */
        
        for(int a: num) {
        	System.out.println(a);
        }
	}

}
