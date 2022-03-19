package inner;

public class StaticInnerExample {

	public void foo() {
		Inner inner = new Inner();
		inner.print();
	}

	static class Inner {
		public void print() {
			System.out.println("static inner class");
		}
	}

	public static void main(String[] args) {
		StaticInnerExample.Inner inner = new StaticInnerExample.Inner();
		inner.print();

		StaticInnerExample staticInner = new StaticInnerExample();
		staticInner.foo();

	}
}
