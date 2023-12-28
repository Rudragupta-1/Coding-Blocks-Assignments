import java.util.*;
public class Main {
    public static void main(String args[]) {
   Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
   int x=a;
   int b=sc.nextInt();
   int y=b;
   while(a!=b)
   {
       if(a>b)

       a-=b;
       else b-=a;
   }
   System.out.println(x*y/a);
    }
}