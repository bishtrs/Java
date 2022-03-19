public class BinarySearch {
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,3,5,6,7};
		//int[] nums = new int[] {2,3,5,6,7,9};
		System.out.println(binarySearch(nums, 2));
		System.out.println(binarySearch(nums, 5));
		System.out.println(binarySearch(nums, 7));
	}
	
	private static int binarySearch(int[] nums, int num) {
		int upper = nums.length-1;
		int lower = 0;
		while (true) {
			int mid = (upper-lower)/2 + lower; //2
			if (num == nums[mid]) {
				return mid;
			} else if (num < nums[mid]) {
				upper = mid -1;
				System.out.println("upper " + upper);
			} else {
				lower = mid + 1;
				System.out.println("lower " + lower);
			}
		}
		//return -1;
	}

}
