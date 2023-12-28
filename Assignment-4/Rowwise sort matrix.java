import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scn.nextInt();
            }
        }
        
        for(int i=0;i<m;i++)
        {
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++)
            {
                list.add(arr[i][j]);
            }
            Collections.sort(list);
            for(int k=0;k<n;k++) System.out.print(list.get(k)+" ");
            System.out.println();
        }
        
    }
}