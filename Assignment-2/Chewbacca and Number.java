import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        long n=scanner.nextLong();
long sew=0,p=1;
while(n>0){
   long r=n%10;
    if(r>9-r){
        if(r==9 && (n/10)==0){

        }
        else{
r=9-r;
        }}
        sew=sew+r*p;
        n=n /10;
        p=p*10;
    
}
System.out.println(sew);
}
}