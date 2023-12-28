import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        String modifiedString = new String("");
        for(int i = 0; i < inputString.length(); i++) {
            if(i % 2 == 0) {
                modifiedString += (char)(inputString.charAt(i) + 1);
            } else {
                modifiedString += (char)(inputString.charAt(i) - 1);
            }
        }
        System.out.println(modifiedString);
    }
}
