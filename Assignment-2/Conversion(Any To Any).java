import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
		long b1 = sc.nextInt();
		long b2 = sc.nextInt();
		long n = sc.nextInt();
		long sum = 0;
		int mul = 1;
		while(n != 0) {
			sum += (n%10)*mul;
			mul *= b1;
			n = n/10;
		}
		mul = 1;
		long sum1 = 0;
		while(sum > 0) {
			long r = sum%b2;
			sum1 += r * mul;
			mul *= 10;
			sum = sum /b2;
		}
		System.out.println(sum1);
    }
}0