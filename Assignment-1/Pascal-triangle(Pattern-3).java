import java.util.*;
public class Main {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
        {
            System.out.print((f(i)/(f(i-j)*f(j)))+" ");
        }
        System.out.println();
    }
    }
    public static int f(int i)
    {
        if(i==0)
        return 1;
        int fa=1;
        for(int j=1;j<=i;j++)
        {
            fa*=j;
        }
        return fa;
    }
}