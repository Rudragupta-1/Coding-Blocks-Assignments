import java.util.*;
import java.math.BigInteger;
public class Main {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     long n=sc.nextLong();
     BigInteger n1= BigInteger.valueOf(n);
     if(n1.isProbablePrime(10))
     System.out.println("Prime");
     else System.out.println("Not Prime");
    }
}