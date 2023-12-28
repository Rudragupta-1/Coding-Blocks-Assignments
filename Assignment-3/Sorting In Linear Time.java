import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner scn=new Scanner(System.in);
        int n = scn.nextInt(); 
         int[] arr=new int[n];
           for (int i = 0; i < n; i++) 
            arr[i]=scn.nextInt();
            sortColors(arr); 
           for (int i = 0; i < arr.length; i++){
              System.out.println(arr[i]);
           }
    }
    public static void sortColors(int[] arr) {
        int n=arr.length;
        int start=0;
        int high=n-1;
        int mid=0;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[mid];
                arr[mid]=arr[start];
                arr[start]=temp;
                mid++;
                start++;
            }
            else if(arr[mid]==1)
            {
                mid++;
            }
            else if(arr[mid]==2){
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}