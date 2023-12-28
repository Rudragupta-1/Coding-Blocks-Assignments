import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        long n11=sc.nextInt();
        long p=1,sss=0;
        while(n11>0)

        {
            long rew=n11%10;
            long xcx=(long)Math.pow(10,rew-1);
            sss+=+p*xcx;
            n11/=10;
            p+=1;
        }
        System.out.println(sss);
    }
}