import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        StringBuilder result = new StringBuilder();
        result.append(inputString.charAt(0));
        int pointer = 0;
        for (int i = 1; i < inputString.length(); i++) {
            if (result.charAt(pointer) != inputString.charAt(i)) {
                result.append(inputString.charAt(i));
                pointer++;
            }
        }
        System.out.println(result);
    }
}
