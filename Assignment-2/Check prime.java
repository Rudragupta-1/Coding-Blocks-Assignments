import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            BigInteger b=BigInteger.valueOf(n);
            if(b.isProbablePrime(10))
            System.out.println("Prime");
            else System.out.println("Not Prime");
    }
}