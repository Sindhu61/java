   Example-9
-----------------------
import java.util.Scanner;
public class Example9{
    static int b,h;
    static int area;
    static
  {
   Scanner sc=new Scanner(System.in);
   b=sc.nextInt();
   h=sc.nextInt();
  }
   public static void main(String[] args){
   if(b>0 && h>0){
          if(b<101 && h<101){
	          area=b*h;
              System.out.println("Area of Parallelogram:"+area);
             }
	    else
              System.out.println("Out of range");
            }
    else
        {
         System.out.println("Breadth and Height must be positive");
        }
}
}
    
  Output:
--------------------
PS C:\517> javac Example9.java
PS C:\517> java Example9      
1
3
Area of Parallelogram:3
