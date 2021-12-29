  compress String Example
------------------------------
import java.util.Scanner;
public class Compress{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str=sc.nextLine();
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            int count=0;
            if(ch!='\0'){
                for(int j=i; j<str.length(); j++){
                    if(ch==str.charAt(j))
                        count++;
                    else
                        break;
                }
                System.out.print(ch+""+count);
            }
            str=str.replace(ch,'\0');

        }
        sc.close();
    }
}

   Output:
--------------------
PS C:\517> javac Compress.java
PS C:\517> java Compress
aaaaabbbbcccdde
a5b4c3d2e1