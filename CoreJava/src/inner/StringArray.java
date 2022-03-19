package inner;
public class StringArray {

	private String[] stringArray;
	private int size = 0;
	private int index = 0;

	public StringArray(int size) {
		this.stringArray = new String[size];
		this.size = size;
	}

	public void add(String data) {
		this.stringArray[index++] = data;
	}

	public void print() {
		StringArrayIterator iterator = this.new StringArrayIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next() + " ");
		}
	}

	class StringArrayIterator implements java.util.Iterator<String> {

		private int nextIndex = 0;

		@Override
		public boolean hasNext() {
			return (nextIndex <= size - 1);
		}

		@Override
		public String next() {
			return stringArray[nextIndex++];
		}
	}

	public static void main(String[] args) {
		StringArray stringArray = new StringArray(5);
		stringArray.add("mercury");
		stringArray.add("venus");
		stringArray.add("earth");
		stringArray.add("mars");
		stringArray.add("jupiter");
		stringArray.print();
	}

}
