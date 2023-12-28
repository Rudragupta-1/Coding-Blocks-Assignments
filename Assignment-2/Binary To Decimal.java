 import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int x=0;
        while(n>0)
        {
            
            int a=n%10;
            sum+=a*Math.pow(2,x);
            x++;
            n/=10;
        }
        System.out.println(sum);
    }
}