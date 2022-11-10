
public class AlternatingSumArrayMethod {

	public static void main(String[] args) {
		int [] nums = {4,12,7,19,23,22,1,5,4};
		
		System.out.println(alternatingSum(nums));

	}

	public static int alternatingSum(int[] values) {
		int alternatingSum = 0;
		for (int i=0; i<values.length; i++) {
			if (i % 2 == 0) {
				alternatingSum += values[i];
			} else alternatingSum -= values[i];
		}
		
		return alternatingSum;
	}
}
