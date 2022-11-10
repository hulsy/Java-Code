
public class ArraySumWithoutSmallest {
	
	public static void main(String[] args) {
		

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

