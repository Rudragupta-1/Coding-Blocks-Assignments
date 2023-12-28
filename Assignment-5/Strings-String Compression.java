import java.util.*;

public class Main {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         String inputString = scanner.nextLine();
         String compressedString = new String("");
         inputString += '&';
         char currentChar;
         currentChar = inputString.charAt(0);
         int count = 1;
         for(int i = 1; i < inputString.length(); i++) {
             if(inputString.charAt(i) != currentChar) {
                 if(count != 1) {
                     compressedString += currentChar + Integer.toString(count);
                     count = 1;
                     currentChar = inputString.charAt(i);
                 } else {
                     compressedString += currentChar;
                     currentChar = inputString.charAt(i);
                 }
             } else {
                 count++;
             }
         }
        
         System.out.println(compressedString);
    }
}
