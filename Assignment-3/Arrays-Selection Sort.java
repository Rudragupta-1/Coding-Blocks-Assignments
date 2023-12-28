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
        for(int i=0;i<n-1;i++)
        {
            int small=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]<arr[small])
                small=j;
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        for(int i:arr)
        System.out.println(i);
    }
}