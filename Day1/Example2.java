import java.util.Scanner;
class Example2{
public static void main(String[] args){
  int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number:");
    n=sc.nextInt();
    sc.close();
  if(n%2==0)
  {
  if(n>=2&&n<=5)
    {
   System.out.println("Not Weird");
    }
   else
    if(n>=6&&n<=20)
     {
      System.out.println("Weird");
     }
  else
   if(n>20)
   {
   System.out.println(" Not Weird");
   }  
  else
   {
System.out.println("Weird");
  }
}
}
}
         OUTPUT:

C:\Sindhu\java>javac Example2.java

C:\Sindhu\java>java Example2
Enter the number:
12
Weird

