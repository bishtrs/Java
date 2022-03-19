package junit5;

public class Calculator {

	public long factorial(int number) {
		if (number == 1) {
			return 1;
		}
		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { //
		 * e.printStackTrace(); }
		 */

		return number * factorial(number - 1);
	}

}
