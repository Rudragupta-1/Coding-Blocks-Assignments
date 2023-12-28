import java.util.*;

public class Main {
    public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         String inputString = scanner.nextLine();
         String compressedString = new String("");
         for(int i = 1; i < inputString.length(); i++) {
            compressedString += inputString.charAt(i - 1);
            compressedString += Integer.toString(inputString.charAt(i) - inputString.charAt(i - 1));
         }
         compressedString += inputString.charAt(inputString.length() - 1);
        
         System.out.println(compressedString);
    }
}
