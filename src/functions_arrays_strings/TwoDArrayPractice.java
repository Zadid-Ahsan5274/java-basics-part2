package functions_arrays_strings;

public class TwoDArrayPractice {

	public static void main(String[] args) {
		
		int[][] array = {{1,2},{3,4},{5,6}};
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				System.out.println("Array ["+i+"] ["+j+"] = "+array[i][j]);
			}
		}

	}

}
