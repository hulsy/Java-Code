import java.io.BufferedReader;
import java.io.FileReader;
import java.math.BigInteger;

public class Day3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new FileReader("inputs3.txt"));
        String line;
        int[] onesCounter = new int[12];
        int[] zeroesCounter = new int[12];
        String mostSignificantBits = "";
        String leastSignificantBits = "";
        while((line = reader.readLine()) != null){
            String[] strBinaryNums = line.split("");
            for (int i=0; i<strBinaryNums.length; i++){
                String num = strBinaryNums[i];
                int digit = Integer.parseInt(num);
                if (digit == 1){
                    onesCounter[i]++; 
                } else {
                    zeroesCounter[i]++;
                }
            }
        }    
        for (int j=0; j<onesCounter.length; j++){
            if (onesCounter[j] > zeroesCounter[j]) {
                mostSignificantBits += "1";
                leastSignificantBits += "0";
            } else {
                mostSignificantBits += "0";
                leastSignificantBits += "1";
            }    
        }
        BigInteger most = new BigInteger(mostSignificantBits, 2);
        BigInteger least = new BigInteger(leastSignificantBits, 2);
        System.out.println(most.intValue() * least.intValue());
        reader.close();
    }
}
