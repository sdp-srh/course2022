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
	
	public static int iterativeFactorial(int n) {
		int result = 1;
		for (int i=1;i<n+1;i++) {
			result = result * i;
		}
		return result;
	}
}
