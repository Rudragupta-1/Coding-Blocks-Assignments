import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int space=n-1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            space--;
            if(i==1 || i==n)
            {
                for(int j=1;j<=n;j++)
                System.out.print("*");
            }
            else
            {
                System.out.print("*");
                for(int j=1;j<=n-2;j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}