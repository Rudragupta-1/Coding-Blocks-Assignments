import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int sum=0;
            int i=0;
            int n=sc.nextInt();
            while(n>0)
            {
                int m=n%10;
                sum+=m*(int)Math.pow(2,i++);
                n/=10;

            }
            System.out.println(sum);
        }
    }
}