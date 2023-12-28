import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long numElements = scanner.nextLong();
        long elements[] = new long[(int) numElements];
        
        for (int i = 0; i < numElements; i++) {
            elements[i] = scanner.nextLong();
        }
        
        long numQueries = scanner.nextLong();
        
        while (numQueries-- > 0) {
            long shiftAmount = scanner.nextLong();
            long[] tempArray = new long[(int) numElements];
            
            for (int i = 0; i < numElements; i++) {
                if (i < shiftAmount) {
                    tempArray[i] = elements[i] + elements[(int) (numElements - shiftAmount + i)];
                } else {
                    tempArray[i] = elements[i] + elements[(int) (i - shiftAmount)];
                }
            }
            
            elements = tempArray;
        }
        
        long sum = 0;
        
        for (int i = 0; i < numElements; i++) {
            sum = (sum + elements[i]) % 1000000007;
        }
        
        System.out.println(sum);
    }
}