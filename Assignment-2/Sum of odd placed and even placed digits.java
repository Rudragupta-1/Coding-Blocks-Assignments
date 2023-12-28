import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int os=0,es=0;
        for(int i=0;n>0;i++)
        {
            
            if(i%2==0) os+=n%10;
            else es+=n%10;
            n/=10;
        }
        System.out.println(os);
        System.out.println(es);
    }
}