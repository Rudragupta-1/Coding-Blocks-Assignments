import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int [] arr = new int[x];
        for(int i = 0; i < x; i++){
            arr[i] = sc.nextInt();
        }
        int a = 0;
        for(int i = 0; i < x; i++){
            a += arr[i];
            System.out.print(a + " ");
        }
    }
}