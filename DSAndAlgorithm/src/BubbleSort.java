
public class BubbleSort {
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,5,7,4,1,9,3};
		for (int num: nums) 
			System.out.print(num);
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums.length-1; j++) {
				if (nums[j] > nums[j+1]) {
					int temp = nums[j];
					nums[j] = nums[j+1];
					nums[j+1] = temp;
				}
			}
		}
		
		System.out.println("\nafter sorting");
		for (int num: nums) 
			System.out.print(num);
	}

	
}
