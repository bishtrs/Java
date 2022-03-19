
public class Factorial {
	
	public static void main(String[] args) {
		System.out.println(factorialIteration());
		System.out.println(factorial(5));
	}

	private static int factorialIteration() {
		int factorial = 1;
		for (int i=1; i<=4; i++) {
			factorial = factorial*i;
		}
		return factorial;
	}
	
	private static int factorial(int num) {
		if (num == 1) {
			return 1;
		}
		return num*factorial(num-1);
	}

}
