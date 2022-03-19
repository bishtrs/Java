package inner;
public class Outer {

	private String name;

	public Outer(String name) {
		this.name = name;
	}

	class Inner {
		public void print() {
			System.out.println(name);
		}
	}

	public static void main(String[] args) {
		Outer outer = new Outer("inner variable");
		Outer.Inner inner = outer.new Inner();
		inner.print();
	}
}
