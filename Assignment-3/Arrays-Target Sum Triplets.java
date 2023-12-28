import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-2;i++)
        {
             int sum=0;
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
               
                sum=arr[i]+arr[left]+arr[right];
                if(sum==target)
                {
                    System.out.println(arr[i]+", "+arr[left]+" and "+arr[right]);
                    left++;
                    right--;
                }
                else if(sum<target)
                {
                    left++;
                }
                else right--;
            }
        }
    }
}