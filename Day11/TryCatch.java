  USING TRY CATCH
-----------------------
Program
-------------
import java.util.Scanner;
public class TryCatch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            int n=Integer.parseInt(sc.nextLine());
            if(100%n==0){
                System.out.println(n+"is a factor");
            }
           }  
           catch(ArithmeticException ex){
               System.out.println("Exception Occured:" +ex);
           }
           sc.close();
    }
}
   
  Output:
--------------------
PS C:\517> javac TryCatch.java
PS C:\517> java TryCatch      
0
Exception Occured:java.lang.ArithmeticException: / by zero


