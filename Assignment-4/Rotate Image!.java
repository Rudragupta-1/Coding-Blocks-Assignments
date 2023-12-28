import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        
        int[][] arr = new int[m][m];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i=0;i<m-1;i++)
        {
            for(int j=m-1;j>=i;j--) 
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        int low=0;
        int high=m-1;
        while(low<high)
        {
                for(int j=0;j<m;j++)
                {
                    int temp=arr[low][j];
                arr[low][j]=arr[high][j];
                arr[high][j]=temp;
                }
                low++;
                high--;
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}