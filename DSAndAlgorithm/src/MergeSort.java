
public class MergeSort {
	
	static int itr = 0;

	public static void sort(int[] data, int start, int end) {
		//System.out.println("itr " + itr);
		itr++;
		if (start < end) {
			int mid = (start + end)/2;
			sort(data, start, mid);
			sort(data, mid + 1, end);
			merge(data, start, mid, mid+1, end);
		}
		
		//merge(new int[] {6,3,4,1}, 0, 1, 2, 3);
		//merge(new int[] {6,3}, 0, 0, 1, 1);
	}
	
	public static void merge(int[] data, int leftStart,int leftEnd,int rightStart,int rightEnd) {
		int[] temp = new int[data.length];
		int counter = leftStart;
		int startPosition = leftStart;
		System.out.println("leftStart " + leftStart);
		System.out.println("leftEnd " + leftEnd);
		System.out.println("rightStart " + rightStart);
		System.out.println("rightEnd " + rightEnd);
		
		while ((leftStart <= leftEnd) && (rightStart <= rightEnd)) {
			System.out.println("data[leftStart] " + data[leftStart]);
			System.out.println("data[rightStart] " + data[rightStart]);
			if (data[leftStart] < (data[rightStart])) {
				temp[counter] = data[leftStart];
				leftStart++;
			} else {
				System.out.println("data[rightStart] " + data[rightStart]);
				temp [counter] = data[rightStart];
				rightStart++;
			}
			
			counter++;
		}
		
		while(leftStart <= leftEnd) {
			temp [counter] = data[leftStart];
			counter ++;
			leftStart++;
		}
		
		while(rightStart <= rightEnd) {
			temp [counter] = data[rightStart];
			counter ++;
			rightStart++;
		}
		System.out.println("startPosition" + startPosition);
		for (int m = startPosition; m<=rightEnd ; m++ ) {
			data[m] = temp[m];
		}
		for (int i : temp) {
			System.out.println("temp2  " + i);
		}
	}
	
	public static void main(String[] args) {
		int[] data = new int[] {6,3,4,1};
		for (int i : data) {
			System.out.println("data " + i);
		}
		sort(data, 0, 3);
		for (int i : data) {
			System.out.println("data " + i);
		}
	}

}
