import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int top=0,left=0;
        int bottom=n-1,right=m-1;
        int c=0;int te=n*m;
        while(c<te)
        {
            for(int i=top;i<=bottom && c<te;i++)
            {
                System.out.print(arr[i][left]+", ");
                c++;
            } left++;
            for(int i=left;i<=right && c<te;i++)
            {
                System.out.print(arr[bottom][i]+", ");
                c++;
            } bottom--;
            for(int i=bottom;i>=top && c<te;i--)
            {
                System.out.print(arr[i][right]+", ");
                c++;
            }right--;
            for(int i=right;i>=left && c<te;i--)
            {
                System.out.print(arr[top][i]+", ");
                c++;
            }
            top++;
        }
        System.out.print("END");
    }
}