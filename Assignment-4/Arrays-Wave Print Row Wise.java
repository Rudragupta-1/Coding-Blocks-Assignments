import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scn=new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr=new int[m][n];
        for (int i=0; i<m; i++){
               for(int j=0; j<n; j++){
                     arr[i][j]=scn.nextInt();
                }
         }
         for(int i=0;i<m;i++)
         {
             for(int j=0;j<n;j++)
             {
                 if(i%2==0)
                 {
                     System.out.print(arr[i][j]+", ");
                 }
                 else System.out.print(arr[i][n-j-1]+", ");
             }
         }
         System.out.print("END");
    }
}