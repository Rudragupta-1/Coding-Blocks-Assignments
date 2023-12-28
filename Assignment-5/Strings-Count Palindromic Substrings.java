import java.util.*;

public class Main {
    
    public static boolean isPalindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end))
                return false;
            else {
                start++;
                end--;
            }
        }
        return true;
    }

    public static int countPalindrome(String s, int i) {
        int leftIndex = i - 1;
        int rightIndex = i + 1;
        int count = 0;
        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            count++;
            leftIndex--;
            rightIndex++;
        }
        return count;
    }

    public static int countDoublePalindrome(String s, int leftIndex, int rightIndex) {
        int count = 0;
        while (leftIndex >= 0 && rightIndex < s.length() && s.charAt(leftIndex) == s.charAt(rightIndex)) {
            count++;
            leftIndex--;
            rightIndex++;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();
        int totalCount = inputString.length();

        for (int i = 1; i < inputString.length(); i++) {
            if (i < inputString.length() - 1) {
                totalCount += countPalindrome(inputString, i);
                totalCount += countDoublePalindrome(inputString, i - 1, i);
            } else {
                totalCount += countDoublePalindrome(inputString, i - 1, i);
            }
        }

        System.out.println(totalCount);
    }
}
