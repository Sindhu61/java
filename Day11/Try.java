  Program
----------------------
import java.util.Scanner;
public class Try{
    public static void main(String[] args){
        try{
            int n=30/0;
            System.out.println("Catch block Executes:");
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException:"+e);
        }
        finally{
            System.out.println("Finally block Executes");
            System.out.println("Rest of the code");
        }
          
    }  
}

  Output:
-------------------
PS C:\517> javac Try.java
PS C:\517> java Try      
ArithmeticException:java.lang.ArithmeticException: / by zero
Finally block Executes
Rest of the code
