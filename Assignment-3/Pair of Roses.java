import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    while(n-->0)
    {
        int a=sc.nextInt();
        int arr[]=new int[a];
    
        for(int i=0;i<a;)
        arr[i++]=sc.nextInt();
        Arrays.sort(arr);
        int tar=sc.nextInt();
        int diff=Integer.MAX_VALUE;
        for(int i=0;i<a-1;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]+arr[j]==tar)
                diff=Math.min(diff,j-i);
            }
        }
        for(int i=0;i<a-1;i++)
        {
            for(int j=i+1;j<a;j++)
            {
                if(arr[i]+arr[j]==tar && j-i==diff)
                System.out.println("Deepak should buy roses whose prices are "+arr[i]+" and "+arr[j]+".");
            }
        }
        
    }
    }
}