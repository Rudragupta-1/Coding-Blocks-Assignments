import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
int n = sc.nextInt();;
int space = 1;
int star = n - 1;


for (int i = 1; i <= 2 * n - 1; i++) {

    
    if (i == 1 || i == 2 * n - 1) {
        
        for (int j = 1; j <= 2 * n - 1; j++) {
            System.out.print("*");
        }
    } else {
        
        for (int j = 1; j <= star; j++) {
            System.out.print("*");
        }
        
        for (int j = 1; j <= space; j++) {
            System.out.print(" ");
        }
        
        for (int j = 1; j <= star; j++) {
            System.out.print("*");
        }
        
        if (i < n) {
            space += 2;
            star--;
        } else {
            space -= 2;
            star++;
        }
    }
    
    System.out.println();
}
    }}

