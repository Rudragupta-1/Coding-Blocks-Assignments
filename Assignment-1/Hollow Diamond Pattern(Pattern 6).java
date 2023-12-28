import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
Scanner sc=new Scanner(System.in);
int GG=sc.nextInt();
int space=-1;
int star=GG/2+1;
int rowws=1;
while(rowws<=GG){
    
    int i=star;
    
    while(i>0){
        System.out.print("*"+"\t");
        i-=1;
    }
    int k=space;
    while(k>0){
        System.out.print("\t");
        k-=1;
    }
    int j;
    if(rowws==1 || rowws==GG)
     j=star-1;
    else
     j=star;
    while(j>0){
        System.out.print("*"+"\t");
        j--;
    }

    if(rowws<=GG/2){
        space+=2;
        star-=1;

    }
    else{
        space-=2;
        star+=1;
    }
    rowws+=1;
System.out.println();
}
    }
}