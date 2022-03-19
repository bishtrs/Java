package annotations;

import java.lang.reflect.Method;

public class TestMethodLevelAnnotation {


	public static void main(String[] args) {
		TestMethodLevelAnnotation test = new TestMethodLevelAnnotation();
		Method method = null;
		try {
			method = test.getClass().getMethod("print");
		} catch (NoSuchMethodException  | SecurityException e) {
			e.printStackTrace();
		}

		LogCurrentTime ml = method.getAnnotation(LogCurrentTime.class);
		System.out.println("value is: " + ml.logTime());
		if (ml.logTime()) {
			System.out.println(System.currentTimeMillis());
		}
		
		try {
			method = test.getClass().getMethod("print2");
		} catch (NoSuchMethodException  | SecurityException e) {
			e.printStackTrace();
		}

		ml = method.getAnnotation(LogCurrentTime.class);
		System.out.println("value is: " + ml.logTime());
		if (ml.logTime()) {
			System.out.println(System.currentTimeMillis());
		}
	}

	@LogCurrentTime(logTime=true)
	public void print() {
		System.out.println("hello");
	}
	
	@LogCurrentTime(logTime=false)
	public void print2() {
		System.out.println("hello");
	}

}
