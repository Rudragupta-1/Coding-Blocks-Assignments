import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        while (testCases-- > 0) {
            int arraySize = scanner.nextInt();
            String[] numbers = new String[arraySize];
            for (int i = 0; i < arraySize; i++) {
                long inputNumber = scanner.nextLong();
                numbers[i] = Long.toString(inputNumber);
            }
            for (int i = 0; i < arraySize - 1; i++) {
                for (int j = i + 1; j < arraySize; j++) {
                    long concatenated1 = Long.parseLong(numbers[i] + numbers[j]);
                    long concatenated2 = Long.parseLong(numbers[j] + numbers[i]);
                    if (concatenated2 > concatenated1) {
                        String temp = numbers[i];
                        numbers[i] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < arraySize; i++) {
                result.append(numbers[i]);
            }
            System.out.println(result);
        }
    }
}
