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
        int t=sc.nextInt();
        while(t-->0)
        {
            int c=0;
            int mon=sc.nextInt();
            int items=sc.nextInt();
            for(int x:arr)
            {
                if(mon%x==0)
                c++;
            }
            if(c>=items)
            System.out.println("Yes");
            else System.out.println("No");
        }
    }
}