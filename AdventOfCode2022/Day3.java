import java.io.BufferedReader;
import java.io.FileReader;

public class Day3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        int priorityScore = 0;
        char matchingItem;
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        String line;

        while((line = reader.readLine()) != null){
            String[] sackArray = line.split("\\n");

            for (int i=0; i<sackArray.length; i++){
                String rucksackContents = sackArray[i];
                String firstCompartment = rucksackContents.substring(0, (rucksackContents.length()/2));
                System.out.println(firstCompartment);
                String secondCompartment = rucksackContents.substring((rucksackContents.length()/2));
                System.out.println(secondCompartment);
                char[] first = firstCompartment.toCharArray();
                char[] second = secondCompartment.toCharArray();
                for (int j=0; j<first.length;j++){
                    for (int k=0; k<second.length; k++){
                        if (first[j] == second[k]) {
                            matchingItem = first[j];
                            for (int l=0; l<letters.length; l++){
                                if (matchingItem == letters[l]){
                                    priorityScore = priorityScore + (l + 1);
                                    for(int r=0; r<first.length; r++){
                                        first[r] = '.';
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(priorityScore);
    }
}
