
public class ArrayPracticeExcercises {

	public static void main(String[] args) {
		
	//write a for loop that prints 10 numbers and another that prints them in reverse
		
//		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		
//		for (int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
//		for (int i=nums.length-1; i>=0; i--) {
//			System.out.println(nums[i]);
//		}

	/* Write a program that initializes an array with ten random integers 
	 * and then prints four lines of output, containing:
	 * Every element at an even index.
	 * Every even element.
	 * All elements in reverse order.
	 * Only the first and last element.
	 */
	
//		int[] randomNums = new int[10];
//		
//		for (int i=0; i<randomNums.length; i++) {
//			randomNums[i] = (int) (Math.random() * 10);
//			System.out.print(randomNums[i] + " ");
//		}
//		System.out.println();
//		
//		for (int i=0; i<randomNums.length; i++) {
//			if (i % 2 == 0) {
//				System.out.print(randomNums[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		for (int i=0; i<randomNums.length; i++) {
//			if (randomNums[i] % 2 == 0) {
//				System.out.print(randomNums[i] + " ");
//			}
//		}
//		System.out.println();
//		
//		for (int i=randomNums.length - 1; i>=0; i--) {
//			System.out.print(randomNums[i] + " ");
//		}
//		System.out.println();
//		System.out.print(randomNums[0] + " " + randomNums[9]);
		
		/*
		 * Write a method sumWithoutSmallest that computes the sum of an array of values, 
		 * except for the smallest one, in a single loop.
		 * In the loop, update the sum and the smallest value. 
		 * After the loop, return the difference.
		 */
			
		
		int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(sumWithoutSmallest(nums));
		
	}
	
	public static int sumWithoutSmallest(int[] values) {
		int sumValues = 0;
		int minValue = values[0];
		for (int i=0; i<values.length; i++) {
			if (values[i] < minValue) {
				minValue = values[i];
			}
			sumValues += values[i];
		}
		sumValues -= minValue;
		return sumValues;
	}

}
