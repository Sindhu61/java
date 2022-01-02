   USING MULTIPLE CATCH BLOCK
-------------------------------------
 Program
---------------
public class MultipleCatch {  
    public static void main(String[] args) {  
        try{     
            int Array[]=new int[5];    
            System.out.println("Array element 10:" +Array[10]);
            Array[5]=10/0;    
        }
        catch(ArithmeticException e)  
        {  
            System.out.println("Arithmetic Exception:"+e);  
        }
        catch(ArrayIndexOutOfBoundsException e)  
        {  
            System.out.println("ArrayIndexOutOfBounds:"+e);  
        } 
        catch(Exception e)  
        {  
            System.out.println("Exception:"+e);  
        }       
    }  
}

  Output:
---------------------
PS C:\517> javac MultipleCatch.java
PS C:\517> java MultipleCatch      
ArrayIndexOutOfBounds:java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 5