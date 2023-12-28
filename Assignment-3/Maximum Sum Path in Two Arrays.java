import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        
        while (testCases-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int[] upArray = new int[n];
            int[] downArray = new int[m];
            int i = 0, j = 0, sumUp = 0, sumDown = 0, result = 0;
            
            for (int k = 0; k < n; k++) {
                upArray[k] = scanner.nextInt();
            }
            for (int k = 0; k < m; k++) {
                downArray[k] = scanner.nextInt();
            }
            
            while (i < n && j < m) {
                if (upArray[i] < downArray[j]) {
                    sumUp += upArray[i];
                    i++;
                } else if (upArray[i] > downArray[j]) {
                    sumDown += downArray[j];
                    j++;
                } else {
                    result += Math.max(sumUp, sumDown);
                    sumUp = 0;
                    
                    sumDown = 0;
                    
                    while (upArray[i] == downArray[j] && i < n && j < m) {
                        result += upArray[i];
                        i++;
                        j++;
                    }
                }
            }
            
            while (i < n) {
                sumUp += upArray[i];
                i++;
            }
            while (j < m) {
                sumDown += downArray[j];
                j++;
            }
            
            result += Math.max(sumUp, sumDown);
            System.out.println(result);
        }
    }
}
