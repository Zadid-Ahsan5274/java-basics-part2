package functions_arrays_strings;

public class FunctionPractice {
	
	/*public static void doAddition() {
		int a = 23;
		int b = 34;
		int sum = a + b;
		System.out.println(sum);
	}*/
	
	public static int doAddition(int a, int b) {
		// int sum = a + b;
		// System.out.println(a+b);
		return a+b;
	}

	public static int doSubtraction(int a, int b) {
		// int sub = a - b;
		// System.out.println(a-b);
		return a - b;
	}
	
	public static int doMultiplication(int a, int b) {
		// int prod = a * b;
		// System.out.println(a*b);
		return a * b;
	}
	
	public static void main(String[] args) {
		
       // doAddition(4,6);
	   // doSubtraction(6,4);
	   System.out.println(doMultiplication(doAddition(4,6),doSubtraction(9,4)));
	}

}
