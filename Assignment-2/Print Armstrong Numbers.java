import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        for(int i=n1;i<=n2;i++)
        {
        int n=i;
        int o=n;
        String s=String.valueOf(n);
        int l=s.length();
        int sum=0;
        while(n>0)
        {
            int x=n%10;
            sum+=Math.pow(x,l);
            n/=10;
        }
        if(sum==o)
        System.out.println(i);
        }
    }
}