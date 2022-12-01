import java.io.BufferedReader;
import java.io.FileReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("inputs.txt"));
        String line;
        String direction = "down";
        int distance = 0;
        int horizontal = 0;
        int vertical = 0;
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
                    break;
                    case "down": vertical += distance;
                    break;
                    case "up": vertical -= distance;
                    break;
                }
                distance = 0;
            }
            System.out.println(horizontal * vertical);
        }
        
        
        
        
        reader.close();
    } 
}
