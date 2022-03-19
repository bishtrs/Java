
public class SelectionSort {
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,5,7,4,1,9,3};
		for (int num: nums) 
			System.out.print(num);
		
		for (int i=0; i<nums.length; i++) {
			for (int j=i+1; j<nums.length; j++) {
				if (nums[i] > nums[j]) {
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			}
		}
		
		System.out.println("\nafter sorting");
		for (int num: nums) 
			System.out.print(num);
	}

	
}
