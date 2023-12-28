import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=1;
        for(int row=1;row<=n;row++)
        {
            for(int coloumn=1;coloumn<=row;coloumn++)
            {
                System.out.print(a+"    ");
                a++;
            }
            System.out.println();
        }
    }
}
