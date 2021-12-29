import java.util.Scanner;
public class Example15{
  public static void main(String[] args){
  String a,b="";
  Scanner sc=new Scanner(System.in);
   a=sc.nextLine();
   int n=a.length();
   for(int i=n-1;i>=0;i--)
   {
     b=b+a.charAt(i);
     sc.close();
   }
  if(a.equalsIgnoreCase(b)){
   System.out.println("Yes");
   }
  else
     System.out.println("No");
}
} 
     OUTPUT:
__________________

C:\517>javac Example15.java

C:\517>java Example15
madam
Yes

C:\517>java Example15
sindhu
No

C:\517>java Example15
wow
Yes