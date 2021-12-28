   Example10
-------------------
import java.util.Scanner;
public class Example10{
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		if (n>=-100 && n<=100){
		  String s=n+" ";
		  System.out.println("Good job");
	   }
		else
			System.out.println("Wrong answer");
	}
}

  Output:
----------------
PS C:\517> javac Example10.java
PS C:\517> java Example10      
100
Good job
PS C:\517> java Example10      
990
Wrong answer