package inner;

public class Parent {

	public void print() {
		System.out.println("parent class print method called");
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.parent.print();
	}

}

class Test {
	Parent parent = new Parent() {
		public void print() {
			System.out.println("child class print method called");
		}
	};

}
