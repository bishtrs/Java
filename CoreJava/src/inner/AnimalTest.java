package inner;

public class AnimalTest {
	
	Animal animal = new Animal() {
		public void run() {
			System.out.println("Tiger is running");
		}
	};
	
	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.animal.run();
	}

}
