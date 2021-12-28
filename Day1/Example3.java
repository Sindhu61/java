import java.util.Scanner;
 public class Example3{
 public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the value:");
   int i=sc.nextInt();
   double d=sc.nextDouble();
   sc.nextLine();
   String s=sc.nextLine();
   System.out.println("String:" +s);
   System.out.println("Double:"+d);
   System.out.println("Int:" +i);
}
}
    OUTPUT:
------------------

C:\Sindhu\java>javac Example3.java

C:\Sindhu\java>java Example3
Enter the value:
95
5.06578
my name is sindhu
String:my name is sindhu
Double:5.06578
Int:95
