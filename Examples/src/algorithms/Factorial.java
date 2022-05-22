package algorithms;

public class Factorial {

	public static void main(String[] args) {
		int result = factorial(5);
		System.out.println("Result: "+result);
	}
	
	public static int factorial(int n) {
		System.out.println("N=" + n);
		if (n <= 1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
