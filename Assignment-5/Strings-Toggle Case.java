import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String convertedString = new String("");
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) >= 97) {
                convertedString += (char)(inputString.charAt(i) - 32);
            } else {
                convertedString += (char)(inputString.charAt(i) + 32);
            }
        }
        System.out.println(convertedString);
    }
}
