package functions_arrays_strings;

public class MaximumAndMinimum {

	public static void main(String[] args) {
		
		int arr[] = {3,5,8,2,9};
        int max = arr[0];
		int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
        	if(max < arr[i]) {
        		max = arr[i];
        	}
        }
        for(int i = 1; i < arr.length; i++) {
        	if(min > arr[i]) {
        		min = arr[i];
        	}
        }
		System.out.println(max);	
        System.out.println(min);	
	}

}
