package exceptions;

public class MyResource implements AutoCloseable {
	
	public void print() {
		System.out.println("print called");
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("closed");
	}
	
	public static void main(String[] args) {
        try (MyResource myResource = new MyResource()) {
        	myResource.print();
        } catch (Exception e) {
        	e.printStackTrace();
        }
    }
}