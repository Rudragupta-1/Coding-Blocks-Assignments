import java.util.*;
public class Main {
    public static void main(String args[]) {
            int c=0;
            Scanner sc=new Scanner(System.in);
            String s=sc.next();
            // System.out.print(s.charAt(0));
            for(int i=0;i<s.length();i++)
            {
                
                if(s.charAt(i)>=65 && s.charAt(i)<=90)
                System.out.println();
                System.out.print(s.charAt(i));
            }   
    }
}