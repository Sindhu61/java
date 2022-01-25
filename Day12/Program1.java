      Day-12
__________________________________

Program-1:
-----------------------
import java.util.Scanner;
public class Split{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String s=sc.nextLine();
        s=s.trim();
        if(s.length()==0){
            System.out.println(0);
        }
        else{
        String[] Line = s.split("[! ,?._'@]+");
        System.out.println(Line.length);
        for(String str:Line)
          System.out.println(str);
          sc.close();
        }
      }
}


   Output:
----------------------------
PS C:\517> javac Split.java
PS C:\517> java Split      
He is a very very good boy,isn't he?
10
He
is
a
very
very
good
boy
isn
t
he