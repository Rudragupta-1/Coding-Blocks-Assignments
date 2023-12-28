import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    static boolean isPossible(ArrayList<Long> rnk, long minTime, long paranthas) {
        int n = rnk.size();
        for (int i = 0; i < n; i++) {
            long tm = 0;
            long ct = 1;
            while (tm + ct * rnk.get(i) <= minTime && paranthas > 0) {
                tm += ct * rnk.get(i);
                paranthas--;
                ct++;
            }
            if (paranthas == 0) return true;
        }
        return (paranthas == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = 1; 
        while (t-- > 0) {
            
            long par = sc.nextLong();
            int n = sc.nextInt();

            
            ArrayList<Long> ran = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                ran.add(sc.nextLong());
            }

               long lo = 0;
            long hi = (long) 1e18;
   long ans = (long) 1e18;

            while (lo <= hi) {
                long mid = (lo + hi) / 2;
                  if (isPossible(ran, mid, par)) {
                    ans = Math.min(ans, mid);
                    hi = mid - 1;
                } else {
                  
                    lo = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}
