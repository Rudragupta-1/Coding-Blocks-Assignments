import java.util.*;

public class Main {
    static int kadane(int[] nums) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            res = Math.max(res, sum);
            if (sum < 0) sum = 0;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();

        while (v-- > 0) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            int k1 = kadane(nums);
            int k2 = 0;
            for (int i = 0; i < n; i++) {
                k2 += nums[i];
                nums[i] = -1 * nums[i];
            }
            k2 += kadane(nums);
            System.out.println(Math.max(k1, k2));
        }
    }
}
