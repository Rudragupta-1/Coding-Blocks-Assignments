import java.util.*;
public class Main {
    public static void main(String args[]) {
Scanner sc=new Scanner(System.in);
String s=sc.next();
s=s+'0';
int c=1;
for(int i=1;i<s.length();i++){
    // System.out.print(s.charAt(i-1));
    if(s.charAt(i)==s.charAt(i-1))
    c++;
    if(s.charAt(i)!=s.charAt(i-1) && c>1){
    System.out.print(s.charAt(i-1));System.out.print(c);c=1;}
    else if(s.charAt(i)!=s.charAt(i-1) && c==1)System.out.print(s.charAt(i-1));
}
    }
}