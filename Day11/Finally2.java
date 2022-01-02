Program:
--------------------
import java.util.Scanner;
public class Finally{
     public static void main(String[] args){
        String name="Sindhu";
        try{
            System.out.println(name.charAt(12));
            try{
                int result=30/0;
               }
             catch(ArithmeticException e){
                 System.out.println("ArithmeticException:"+e);
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
------------------------
PS C:\517> javac Finally.java
PS C:\517> java Finally      
java.lang.StringIndexOutOfBoundsException: String index out of range: 12
outer finally block executed