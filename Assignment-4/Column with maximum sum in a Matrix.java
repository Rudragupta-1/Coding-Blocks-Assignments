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
        int index=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<m;i++)
        {  int sum=0;
            for(int j=0;j<m;j++)
            {
                sum+=arr[i][j];
            }
            if(sum>max){
                max=sum;
                index=i+1;
            }
        }
        System.out.println(index+" "+max);
    }
}