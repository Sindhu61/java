            Using String Methods
___________________________________________________________________


String charAt():
-----------
Example Program
------------------

import java.util.Scanner;
  public class CharAt{  
    public static void main(String args[]){ 
        Scanner sc= new Scanner(System.in); 
       String s=sc.nextLine(); 
    char ch=s.charAt(4);
    System.out.println(ch);  
    }
} 

   OUTPUT:
--------------
PS C:\517> javac CharAt.java       
PS C:\517> java CharAt      
Sindhu
h

String length()
------------------
Example Program
-----------------------
import java.util.Scanner; 
public class Length{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        System.out.println("String:"+s);
        int length=s.length();
        System.out.println("Length:"+length);
    }
}

   OUTPUT:
--------------
PS C:\517> javac Length.java
PS C:\517> java Length      
Enter the string
Sindhu
String:Sindhu
Length:6


String concat()
------------------------
Example Program
----------------
import java.util.Scanner;
 public class Concat{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the two strings");
         String s1=sc.nextLine();
         String s2=sc.nextLine();
         System.out.println("First String:"+s1);
         System.out.println("second String:"+s2);
         String combinedString=s1.concat(s2);
         System.out.println("CombinedString:"+combinedString);
     }
 }

   OUTPUT:
------------------
PS C:\517> javac Concat.java
PS C:\517> java Concat
Enter the two strings
Sindhu
Bhumireddy
First String:Sindhu
second String:Bhumireddy
CombinedString:SindhuBhumireddy 

4.String compareTo()
______________________
Example Program
---------------------
import java.util.Scanner;
 public class CompareTo{
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the strings");
         String s1=sc.nextLine();
         String s2=sc.nextLine();
         String s3=sc.nextLine();
         String s4=sc.nextLine();
         System.out.println(s1.compareTo(s2));
         System.out.println(s3.compareTo(s4));
     }
 }

   OUTPUT:

---------------
PS C:\517> javac CompareTo.java
PS C:\517> java CompareTo      
Enter the strings
sindhu
sudheshna
sirisha
friends
-12
13 

5.String replace()
___________________
Example Program
------------------
import java.util.Scanner;
 public class Replace{
   public static void main(String[] args){
       String str="Sindhu";
       String replace=str.replace('n','r');
       System.out.println(str);
       System.out.println(replace);
   }

 }
  
  OUTPUT:
---------------
PS C:\517> javac Replace.java
PS C:\517> java Replace
Sindhu
Sirdhu

String subString()
____________________________
Example Program
------------------
import java.util.Scanner;
public class SubString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.nextLine();
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(11,13));
    }
}

 OUTPUT:
-------------------

PS C:\517> javac SubString.java
PS C:\517> java SubString      
Enter the String
BhumireddySindhu
Bhumi
in

