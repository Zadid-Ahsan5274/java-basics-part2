package functions_arrays_strings;

public class FindDuplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,4,3,5,6,7,5};
        for(int i = 0; i < arr.length; i++) {
        	for(int j = i + 1; j < arr.length; j++) {
        		if(arr[i] == arr[j]) {
        			System.out.println(arr[i]);
        		}
        	}        	
        }	
	}

}
