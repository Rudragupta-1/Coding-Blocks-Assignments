import java.util.*;

public class Main {
   static void swap(int[] array, int i, int j) {
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
   }
   
   static void reverse(int[] array, int start, int end) {
      while (start < end) {
         swap(array, start, end);
         start++;
         end--;
      }
   }
   
   public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int testCases = scanner.nextInt();
      
      for (int l = 0; l < testCases; l++) {
         int n = scanner.nextInt();
         int arr[] = new int[n];
         
         for (int i = 0; i < n; i++) {
            int element = scanner.nextInt();
            arr[i] = element;
         }
         
         int i, j;
         for (i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
               break;
            }
         }

         if (i < 0) {
            reverse(arr, 0, arr.length - 1);
         } else {
            for (j = n - 1; j > i; j--) {
               if (arr[j] > arr[i]) {
                  break;
               }
            }

            swap(arr, i, j);
            reverse(arr, i + 1, arr.length - 1);
         }
         
         for (i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
      }
   }
}
