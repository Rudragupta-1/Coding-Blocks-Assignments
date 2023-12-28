import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong(); 
            int k = sc.nextInt();
            long x = 0;
            long low=0;
            long high=n;
            while(low<=high)
            {
                long mid=(low+high)/2;
                long g=(long)Math.pow(mid,k);
                if(g<=n){low=mid+1;x=mid;}
                else high=mid-1;
            }
            System.out.println(x);
        }
    }
}
