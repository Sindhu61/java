import java.util.Scanner;
public class Example4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("========================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1,x);
    }
System.out.println("============================");
  }
}  
OUTPUT:
PS C:\517> javac Example4.java
PS C:\517> java Example4
========================
java 100 cpp 65 python 50
java           100
cpp            065
python         050
============================