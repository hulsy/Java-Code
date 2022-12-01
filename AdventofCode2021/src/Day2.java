import java.io.BufferedReader;
import java.io.FileReader;

public class Day2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("inputs.txt"));
        String line;
        String direction = "down";
        int distance = 0;
        int horizontal = 0;
        int depth = 0;
        int aim = 0;
        while ((line = reader.readLine()) != null){
            String[] splitInstructions = line.split("\\s");
            for(int i=0; i<splitInstructions.length; i++){
                if (i % 2 == 0){
                    direction = splitInstructions[i];
                    // System.out.println(direction);
                }
                if(i % 2 != 0){ 
                    distance = Integer.parseInt(splitInstructions[i]);
                    // System.out.println(distance);
                }
                switch(direction){
                    case "forward": horizontal += distance;
                                    depth += (aim * distance);
                    break;
                    case "down": aim += distance;
                    break;
                    case "up": aim -= distance;
                    break;
                }
                distance = 0;
            }
        }
        System.out.println(horizontal * depth);
        reader.close();
    } 
}
