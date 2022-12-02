import java.io.BufferedReader;
import java.io.FileReader;

public class Day2 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int score = 0;
        String playerOne = "";
        String playerTwo = "";
        String line;
        while((line = reader.readLine()) != null){
            String[] playerPicked = line.split("");
            for(int i=0; i<playerPicked.length; i+=3){
                if (i%2 == 0){
                    playerOne = playerPicked[i];
                    playerTwo = playerPicked[i+2];
                }
                if (playerOne.equals("A")) {
                    if (playerTwo.equals("X")){
                        score += 3;
                    }
                }
                if (playerOne.equals("A")) {
                    if (playerTwo.equals("Y")){
                        score += 4;
                    }
                }
                if (playerOne.equals("A")) {
                    if (playerTwo.equals("Z")){
                        score += 8;
                    }
                }
                if (playerOne.equals("B")) {
                    if (playerTwo.equals("X")){
                        score += 1;
                    }
                }
                if (playerOne.equals("B")) {
                    if (playerTwo.equals("Y")){
                        score += 5;
                    }
                }
                if (playerOne.equals("B")) {
                    if (playerTwo.equals("Z")){
                        score += 9;
                    }
                }
                if (playerOne.equals("C")) {
                    if (playerTwo.equals("X")){
                        score += 2;
                    }
                }
                if (playerOne.equals("C")) {
                    if (playerTwo.equals("Y")){
                        score += 6;
                    }
                }
                if (playerOne.equals("C")) {
                    if (playerTwo.equals("Z")){
                        score += 7;
                    }
                }
            }
        }

        System.out.println(score);
        reader.close();
    }   
}
