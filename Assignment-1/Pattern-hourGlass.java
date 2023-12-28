import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int space=0;
		for(int i=n;i>=0;i--)
		{
		    for(int j=1;j<=space;j++)
		    {
		        System.out.print("  ");
		    }
		    space++;
		    for(int j=i;j>=0;j--)
		    {
		        System.out.print(j+" ");
		    }
		    for(int j=1;j<=i;j++)
		    {
		    System.out.print(j+" ");
		    }
		    System.out.println();
		}
		space--;
		for(int i=1;i<=n;i++)
		{
		    space--;
		    for(int j=1;j<=space;j++)
		    System.out.print("  ");
		    for(int j=i;j>=0;j--)
		    System.out.print(j+" ");
		    for(int j=1;j<=i;j++)
		    System.out.print(j+" ");
		    System.out.println();
		}
	}
}
