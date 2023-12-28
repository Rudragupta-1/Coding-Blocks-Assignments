import java.util.*;
public class Main {
    public static void main (String args[]) {
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
        boolean arr_row[]=new boolean[n];
         boolean arr_col[]=new boolean[m];
         Arrays.fill(arr_col,false);
         Arrays.fill(arr_row,false);
         for(int i=0;i<n;i++)
         {
             
             for(int j=0;j<m;j++)
             {
                    if(arr[i][j]==1){
                    arr_row[i]=true;
                    arr_col[j]=true;
             }}
         }
         for(int i=0;i<n;i++)
         {
             if(arr_row[i]==true){
             for(int j=0;j<m;j++)
             {
                 arr[i][j]=1;
             }}
         }
         for(int i=0;i<m;i++)
         { if(arr_col[i]==true){
             for(int j=0;j<n;j++)
             {
                 arr[j][i]=1;
             }}
         }
         for(int i=0;i<n;i++)
         {
             for(int j=0;j<m;j++)
             {
                 System.out.print(arr[i][j]+" ");
             }
             System.out.println();
         }
    }
}