import java.util.*;

public class Main {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

		int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
		long[] ans = Array_Except(arr);
		for (int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}

	public static long[] Array_Except(int[] arr) {
		int n = arr.length;
		long[] lefttt = new long[n];
		lefttt[0] = 1;
		for (int i = 1; i < lefttt.length; i++) {
			lefttt[i] = lefttt[i - 1] * arr[i - 1];
		}
		long[] rightttt = new long[n];
		rightttt[n - 1] = 1;
		for (int i = n - 2; i >= 0; i--) {
			rightttt[i] = rightttt[i + 1] * arr[i + 1];
		}
		for (int i = 0; i < rightttt.length; i++) {
			lefttt[i] = lefttt[i] * rightttt[i];
		}
		return lefttt;

	}
         
}
