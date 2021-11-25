import java.math.*;
import java.util.Scanner;
public  class Example5{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter value");
    int N=sc.nextInt();
   if(N>=5||N<=50)
 {
   for(int i=1;i<=10;i++)
    { 
System.out.println(N+"x"+i+"="+N*i );
}
}
}
}

 OUTPUT:
----------------------

C:\517>javac Example5.java

C:\517>java Example5
enter value
5
5x1=5
5x2=10
5x3=15
5x4=20
5x5=25
5x6=30
5x7=35
5x8=40
5x9=45
5x10=50








      