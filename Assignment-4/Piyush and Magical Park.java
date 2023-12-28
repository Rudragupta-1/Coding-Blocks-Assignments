import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        String arr[][] = new String[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.next();
            }
        }
        int flag=1;
        for(int i=0;i<n;i++)
        {

            if(s<k)
            {
                flag=0;
                break;
            }
            for(int j=0;j<m;j++)
            {
                if(j!=m-1)
                s-=1;
                if(arr[i][j].equals("."))
                s-=2;
                if(arr[i][j].equals("*"))
                s+=5;
                if(arr[i][j].equals("#")){
                    {
                s+=1;} break;}
            }
        }
         if(flag==1)
         {
             System.out.println("Yes");
             System.out.println(s);
         }   
         else System.out.println("No");
    }
}
