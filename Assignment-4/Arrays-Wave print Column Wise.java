import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        int b = 0;
        int a = 0; 
        for (int i = 0; i < n; i++) {
            if (b % 2 == 0)
                a = 0;
            else
                a = m - 1;
            for (int j = 0; j < m; j++) {
                System.out.print(arr[a][b] + ", ");
                if (b % 2 == 0)
                    a++;
                else
                    a--;
            }
            b++;
        }
        System.out.print("END");
    }
}
