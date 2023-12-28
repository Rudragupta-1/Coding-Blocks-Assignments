import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int star=1,space=n/2;
        for(int row=1;row<=n;row++)
        {

            
                for(int j=1;j<=space;j++)
                {
                    System.out.print("\t");
                }
                for(int j=1;j<=star;j++)
                {
                    System.out.print("*\t");
                }
                if(row<n/2+1){
                star+=2;
                space--;}
                else{
                    star-=2;
                    space++;
                }
            
            System.out.println();
        }
    }
}
