     DAy 2
_____________________
 
 Program
-------------------
import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
class Example6{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(int i=0;i<t;i++){
  int  a=sc.nextInt();
  int b=sc.nextInt();
  int n=sc.nextInt();
  int solution=a;
for(int j=0;j<n;j++)
{
 solution+=(((Math.pow(2,j))*b));
System.out.print( " " +solution);
}
}
  sc.close();
}
}


   Output:
-------------
PS C:\517> javac Example6.java
PS C:\517> java Example6      
2
0 2 10
 2 6 14 30 62 126 254 510 1022 2046
5 3 5
 8 14 26 50 98