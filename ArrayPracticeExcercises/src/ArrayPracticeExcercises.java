
public class ArrayPracticeExcercises {

	public static void main(String[] args) {
		
	//write a for loop that prints 10 numbers and another that prints them in reverse
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int i=0; i<nums.length; i++) {
			System.out.println(nums[i]);
		}
		for (int i=nums.length-1; i>=0; i--) {
			System.out.println(nums[i]);
		}
	}

}
