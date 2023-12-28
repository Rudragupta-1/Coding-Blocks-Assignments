import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
for(int row=0;row<num/2;row++){
    for(int j=1;j<num-2*row;j++){
        System.out.print("\t");

    }
    for(int j=row+1;j>0;j--){
        System.out.print(j+"\t");
    }
    for(int j=0;j<2*row-1;j++){
        System.out.print("\t");
    }
    for(int j=1;row>0 && j<=row+1;j++){
        System.out.print(j+"\t");
    }
System.out.println();
}
for(int i=num/2;i>=0;i--){
     for(int j=1;j<num-2*i;j++){
        System.out.print("\t");

    }
    for(int j=i+1;j>0;j--){
        System.out.print(j+"\t");
    }
    for(int j=0;j<2*i-1;j++){
        System.out.print("\t");
    }
    for(int j=1; i>0 && j<=i+1;j++){
        System.out.print(j+"\t");
    }
System.out.println();

}

    }
}