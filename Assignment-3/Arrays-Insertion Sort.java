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
        for(int i=1;i<n;i++)
        {
            int curr=arr[i];
            int j=i-1;
        while(j>=0 && curr<arr[j])
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=curr;
        }
        for(int i:arr)
        System.out.print(i+" ");
    }
}//