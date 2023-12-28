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
        int res[]=new int[n];
        int k=0;
        for(int i=arr.length-1;i>=0;i--)
        {
            res[k]=arr[i];
            k++;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(res[i]);
        }

    }
}