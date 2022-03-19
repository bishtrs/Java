
public class Fibonacci {
	
	public static void main(String[] args) {
		System.out.println(fibonacciIteration(1)); // 1,1,2,3,5,8,13
		System.out.println(fibonacciIteration(2));
		System.out.println(fibonacciIteration(3));
		System.out.println(fibonacciIteration(4));
		System.out.println(fibonacciIteration(5));
		System.out.println(fibonacciIteration(6));
		System.out.println(fibonacci(1));
		System.out.println(fibonacci(2));
		System.out.println(fibonacci(3));
		System.out.println(fibonacci(4));
		System.out.println(fibonacci(5));
	}

	private static int fibonacciIteration(int n) {
		int n1 = 0;
		int n2 = 1;
		int n3 = 1;
		
		for (int i=1; i<n; i++) {
			n3 = n1 + n2;
			n1 = n2;
			n2 = n3;
		}

		return n3;
	}
	
	private static int fibonacci(int n) {
		if (n == 1 || n == 2) {
	         return 1;
		} else {
			return fibonacci(n-1) + fibonacci(n-2);
		}
	}

}
