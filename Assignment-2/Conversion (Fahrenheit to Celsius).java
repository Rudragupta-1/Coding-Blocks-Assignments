import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int min=sc.nextInt();
        int max=sc.nextInt();
        int step=sc.nextInt();
        double cel;
        for(int fah=min;fah<=max;fah+=step)
        {
            cel=(5.0/9.0)*(fah-32);
            System.out.println(fah+"    "+(int)(cel));
        }
    }
}
