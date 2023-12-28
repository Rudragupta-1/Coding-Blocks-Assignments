import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=n;
        int sum=0;
        while(n>0)
        {
            sum+=n%10;
            n/=10;
        } int sum1=0;
        for(int i=2;i<=x;i++)
        {
            BigInteger y=BigInteger.valueOf(i);
            if( x%i==0 && y.isProbablePrime(1000))
            while(x%i==0){
            sum1+=i;
            x/=i;
        }
        }
        if(sum==sum1)
        System.out.println(1);
        else System.out.println(0);
    }
}