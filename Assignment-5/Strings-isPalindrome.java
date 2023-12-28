import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        int leftPointer = 0, rightPointer = userInput.length() - 1;
        boolean isPalindrome = true;
        while (leftPointer <= rightPointer) {
            if (userInput.charAt(leftPointer) != userInput.charAt(rightPointer)) {
                System.out.println("false");
                isPalindrome = false;
                break;
            } else {
                leftPointer++;
                rightPointer--;
            }
        }
        if (isPalindrome) {
            System.out.println("true");
        }
    }
}
