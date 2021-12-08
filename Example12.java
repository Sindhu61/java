import java.io.*;
import java.util.*;
public class Example12{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String A=sc.next();
    String B=sc.next(); 
    int length;
   length=A.length()+B.length();
   System.out.println(length);
   int C=A.compareTo(B);
if(C>0)
{
 System.out.println("Yes");
 }
else{
System.out.println("No");
}
System.out.println(A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase()+ " ");
System.out.println(B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase());
}
}
   OUTPUT:

C:\517>javac Example12.java

C:\517>java Example12
hello
java
9
No
Hello
Java