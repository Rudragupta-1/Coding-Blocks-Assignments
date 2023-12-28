import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int[] characterCount = new int[250];
        
        for (int i = 0; i < userInput.length(); i++) {
            int charCode = (int) userInput.charAt(i);
            characterCount[charCode]++;
        }
        
        int maxCount = -1;
        int mostFrequentCharCode = 0;
        
        for (int i = 0; i < 250; i++) {
            if (characterCount[i] > maxCount) {
                maxCount = characterCount[i];
                mostFrequentCharCode = i;
            }
        }
        
        System.out.println((char) mostFrequentCharCode);
    }
}
