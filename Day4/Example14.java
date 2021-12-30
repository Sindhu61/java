  Example14
--------------------
import java.io.*;
import java.util.*;
class Example14{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  String a=sc.nextLine();
  String b=sc.nextLine();
  if(isAnagram(a,b)){
    System.out.println("Anagrams");
  }
  else
   System.out.println("Not Anagrams");
   sc.close();
   }
  public static boolean isAnagram(String a,String b){
   a=a.replaceAll(" ","");
   b=b.replaceAll(" ","");
   if(a.length()!=b.length()){
   return false;
   }
   else{
   char[]array1=(a.toLowerCase()).toCharArray();
   char[]array2=(b.toLowerCase()).toCharArray();
   Arrays.sort(array1);
   Arrays.sort(array2);
   return(Arrays.equals(array1,array2));
   }
  }
}

  Output:
-------------------
PS C:\517> javac Example14.java
PS C:\517> java Example14
anagram
margana
Anagrams
PS C:\517> java Example14
anagramm
marganaa
Not Anagrams