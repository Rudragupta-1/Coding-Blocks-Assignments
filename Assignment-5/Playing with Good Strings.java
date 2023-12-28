import java.util.*;

public class Main {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         String inputString = scanner.nextLine();
         int maxVowelSequence = 0;
         int currentVowelCount = 0;
         for(int i = 0; i < inputString.length(); i++) {
            if (isVowel(inputString.charAt(i))) {
                currentVowelCount++;
            } else {
                maxVowelSequence = Math.max(maxVowelSequence, currentVowelCount);
                currentVowelCount = 0;
            }
         }
         maxVowelSequence = Math.max(maxVowelSequence, currentVowelCount);
        
         System.out.println(maxVowelSequence);
    }
    
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
