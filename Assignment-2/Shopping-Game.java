import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner  sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n1=sc.nextInt();
            int n2=sc.nextInt();
             int x=0;
            int y=0;
            int i=1;
            while(x<=n1 && y<=n2)
            {
                if(i%2!=0){
                x+=i;i++;}
                else {y+=i;i++;}

            }
            if(y>n2)
            System.out.println("Aayush");
            else System.out.println("Harshit");
        }
    }
}