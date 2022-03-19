package calculator;
public class Calculator {
	
	public double multiply(double number1, double number2) {
		return number1 * number2;
	}
	
	public double divide(int number1, int number2) {
		return number1/number2;
	}
	
	public long factorial(int number) {
		if (number == 1) {
			return 1;
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return number*factorial(number-1);
	}
	
	public int subtract(int a, int b) {
		return a-b;
	}
}