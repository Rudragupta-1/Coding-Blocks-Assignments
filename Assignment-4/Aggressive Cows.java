import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int ans = -1;
        int max_dist = arr[n - 1]; 
        for (int dist = 1; dist <= max_dist; dist++) { 
            if (isPossible(arr, dist, n, k))
                ans = dist;
            else
                break;
        }
        System.out.println(ans);
    }

    public static boolean isPossible(int pos[], int dist, int n, int k) {
        int count = 1;
        int prev = pos[0];
        for (int curr_pos = 1; curr_pos < n; curr_pos++) { 
            int curr = pos[curr_pos];
            if (curr - prev >= dist) {
                prev = curr;
                count++;
            }
        }
        return count >= k;
    }
}
