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
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(arr[top][i]+", ");
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                System.out.print(arr[i][right]+", ");
            }right--;
            if(top<=bottom){
            for(int i=right;i>=left;i--)
            {
                System.out.print(arr[bottom][i]+", ");
            }
            bottom--;}if(left<=right){
            for(int i=bottom;i>=top;i--)
            {
                System.out.print(arr[i][left]+", ");
            }
            left++;}
        }
        System.out.print("END");
    }
}