package inner;

public class MethodLocal {

	private String name;

	public MethodLocal(String name) {
		this.name = name;
	}

	public void foo() {
		int x = 20;
		class Inner {
			public void print() {
				System.out.println(name);
				System.out.println(x);
			}
		}
		Inner inner = new Inner();
		inner.print();
	}

	public static void main(String[] args) {
		MethodLocal outer = new MethodLocal("method local example");
		outer.foo();
	}
}
