import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = 2 * n - 1;
        
        for (int i = 1; i <= n; i++) {
            int x = n;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x--;
            }
            for (int j = space; j >= 1; j--) {
                System.out.print("  "); 
            }
            space -= 2;
            for (int j = n - i + 1; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        for (int j = n; j >= 0; j--) {
            System.out.print(j + " ");
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(j + " ");
        }
        int s = 1;
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= s; j++) {
                System.out.print("  "); 
            }
            s += 2;
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
