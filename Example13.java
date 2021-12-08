import java.util.Scanner;
public class Example13{
  public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int start=sc.nextInt();
    int end=sc.nextInt();
   System.out.println(s.substring(start,end));
}
}
       OUTPUT:
--------------------

C:\517>javac Example13.java

C:\517>java Example13
Helloworld
3 7
lowo