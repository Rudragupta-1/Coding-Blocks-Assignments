import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int h=sc.nextInt();
            int height[]=new int[h];
            for(int i=0;i<h;i++)
            {
                height[i]=sc.nextInt();
            }
            int n=height.length;
        int lmax[]=new int[n];
        int rmax[]=new int[n];
        lmax[0]=height[0];
        rmax[n-1]=height[n-1];
        for(int i=1;i<n;i++)
        {
            lmax[i]=Math.max(height[i],lmax[i-1]);
            
        }
        for(int j=n-2;j>=0;j--)
        {
            int temp=Math.max(height[j],rmax[j+1]);
            rmax[j]=temp;
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=Math.min(lmax[i],rmax[i])-height[i];
        }
        System.out.println(sum);
        }
    }
}