import java.io.*;
import java.util.*;
public class Example16{
  static int count;
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   for(int i=2;i<n;i++){
    if(n%i==0)
    count++;
    }
   if(count==0){
    System.out.println(n+"is a prime number");
   }
   else
    System.out.println(n+"is not a prime number");
}
} 
     OUTPUT:
-------------------

C:\517>javac Example16.java
C:\517>java Example16
29
29is a prime number

C:\517>java Example16
33
33is not a prime number