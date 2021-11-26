import java.util.Scanner;
import java.io.*;
import java.lang.Math.*;
class Example6{
 public static void main(String[] args){
 Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
for(i=0;i<t;i++){
  int  a=sc.nextInt();
  int b=sc.nextInt();
  int n=sc.nextInt();
  solution=a;
for(int j=0;j<n;j++)
{
 solution+=(((Math.pow(2,j))*b));
System.out.println( " " +solution);
}
}
  sc.close();
}
}

                                                               
   