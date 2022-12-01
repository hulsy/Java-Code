import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Day1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		ArrayList<Integer> calorieCounter = new ArrayList<Integer>();
		String line;
		int calories = 0;
		int mostCalories = 0;
		while((line = reader.readLine()) != null) {
				String cal = line.trim();
				if (cal.isBlank()) {
					if(mostCalories < calories) {
						mostCalories = calories;
					}
					calorieCounter.add(calories);
					calories = 0;
					continue;
				}
					calories += Integer.parseInt(cal);	
		}
		Collections.sort(calorieCounter, Collections.reverseOrder());
		for(int i: calorieCounter) {
			System.out.println(i);
		}
		int totalCalInventory = calorieCounter.get(0) + calorieCounter.get(1) + calorieCounter.get(2);
		System.out.println(totalCalInventory);
		reader.close();
	}
}
