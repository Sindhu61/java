 Example-8
------------------
    Program
-------------------
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Example8{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i=1;
        while(sc.hasNext()){
        String s=sc.nextLine();
         System.out.println(i +" " + s);
         i++;
        }
    }
}
                    OUTPUT:
--------------------------------------
PS C:\517> javac Example8.java
PS C:\517> java Example8
Hello World
1 Hello World
I am a file
2 I am a file
Read me until end-of-file
3 Read me until end-of-file