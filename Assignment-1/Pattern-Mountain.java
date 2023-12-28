import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int c = 1; c <= row; c++) {
                System.out.print(c + "\t");
            }

            for (int space = 1; space <=(2*n-1)-2*row; space++) {
                System.out.print("\t");
            }
            if(row==n)
            {
                for (int c = row-1; c >= 1; c--) {
                System.out.print(c + "\t");
            }
            }
            else{
            for (int c = row; c >= 1; c--) {
                System.out.print(c + "\t");
            }
            }
            System.out.println();
        }
    }
}
