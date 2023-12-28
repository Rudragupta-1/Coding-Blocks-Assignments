import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int a = row; 
            for (int space = n - row; space >= 1; space--) {
                System.out.print("    ");  
            }
            for (int coloumn = 1; coloumn <= row; coloumn++) {
                System.out.print(a+"    ");
                a++;
            }
            a -= 2;  
            for (int coloumn = 1; coloumn <= row - 1; coloumn++) {
                System.out.print(a+"    ");
                a--;
            }
            System.out.println();
        }
    }
}
