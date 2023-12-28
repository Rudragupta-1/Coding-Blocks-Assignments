import java.util.*;

public class Main {

    public static boolean isPrime(long num) {
        if (num == 0 || num == 1)
            return false;

        long[] primeArray = { 2, 3, 5, 7, 11, 13, 17, 19 };
        for (int i = 0; i < primeArray.length; i++) {
            if (primeArray[i] == num)
                return true;
        }
        for (int i = 0; i < primeArray.length; i++) {
            if (num % primeArray[i] == 0)
                return false;
        }
        return true;
    }

    public static boolean areAllNotVisited(boolean[] visited, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (visited[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        String inputString = sc.next();
        sc.close();
        boolean[] visited = new boolean[inputString.length()];
        long count = 0;

        for (int len = 1; len <= inputString.length(); len++) {
            for (int j = len; j <= inputString.length(); j++) {
                int i = j - len;
                String substring = inputString.substring(i, j);
                long number = Long.parseLong(substring);
                if (isPrime(number) && areAllNotVisited(visited, i, j - 1)) {
                    count++;
                    for (int k = i; k < j; k++) {
                        visited[k] = true;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
