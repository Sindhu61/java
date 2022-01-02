   USING TRY CATCH FINALLY BLOCKS
________________________________________
 PROGRAM:
------------
import java.util.Scanner;
public class Finally{
     public static void main(String[] args){
        String name="Sindhu";
        try{
            System.out.println(name.charAt(2));
            try{
                int result=30/0;
               }
            finally{
                System.out.println("Executing inner finally block");
               }
            }
         catch(StringIndexOutOfBoundsException e){
             System.out.println(e);
         }   
         finally{
             System.out.println("outer finally block executed");
         }
       }
     }

   OUTPUT:
-----------------------
PS C:\517> javac Finally.java
PS C:\517> java Finally      
n
ArithmeticException:java.lang.ArithmeticException: / by zero
Executing inner finally block
outer finally block executed

