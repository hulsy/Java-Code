import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Day1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
		String line;
		int calories = 0;
		int mostCalories = 0;
		while((line = reader.readLine()) != null) {
				String cal = line.trim();
				if (cal.isBlank()) {
					if(mostCalories < calories) {
						mostCalories = calories;
					}
					calories = 0;
					continue;
				}
					calories += Integer.parseInt(cal);	
		}
		System.out.println(mostCalories);
		reader.close();
	}
}
