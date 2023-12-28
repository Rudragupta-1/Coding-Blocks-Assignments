import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print("\t");
                }
                for(int j=i;j<=2*i-1;j++)
                {
                    System.out.print(j+"\t");
                }
                for(int j=2*i-2;j>=i;j--)
                {
                    System.out.print(j+"\t");
                }
                System.out.println();
            }
            int s=1;
            for(int i=n-1;i>=1;i--)
            {
                for(int j=1;j<=s;j++)
                {
                    System.out.print("\t");
                }
                s++;
                for(int j=i;j<=2*i-1;j++)
                {
                    System.out.print(j+"\t");
                }
                for(int j=2*i-2;j>=i;j--)
                {
                    System.out.print(j+"\t");
                }
                System.out.println();
            }
    }
}