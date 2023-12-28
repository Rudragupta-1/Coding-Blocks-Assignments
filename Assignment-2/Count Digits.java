import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        char arr[]=String.valueOf(n).toCharArray();
        int c=0;
        for(int i=0;i<arr.length;i++)
        {
            if(Character.getNumericValue(arr[i])==a)
            c++;
        }
        System.out.println(c);
    }
}