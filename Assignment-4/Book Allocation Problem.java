import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                max=Math.max(max,arr[i]);
            }
            int sum=Arrays.stream(arr).sum();
            int low=max;
            int high=sum;
            while(low<=high)
            {
                int mid=(low+high)/2;
                int students =count(arr,mid);
                if(students>m) low=mid+1;
                else high=mid-1;
            }
            System.out.println(low);
        }
        
    }
    public static int count(int[] arr,int pages)
    {
        int students=1;
       long pagesStudent=0;
       for(int i=0;i<arr.length;i++)
       {
            if( pagesStudent+arr[i]<=pages)
            pagesStudent+=arr[i];
            else{ students+=1;
            pagesStudent=arr[i];
            }
       }
       return students;
    }
}