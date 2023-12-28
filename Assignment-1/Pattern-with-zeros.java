import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int row=1;row<=n;row++)
        {
            for(int coloumn=1;coloumn<=row;coloumn++)
            {
                if(coloumn==1 || coloumn==row)
                System.out.print(row+"    ");
                else System.out.print(0+"    ");
            }
            System.out.println();
        }
    }
}