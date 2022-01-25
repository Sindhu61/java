// PROGRAM

import java.util.regex.Matcher;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.io.FileReader;
public class Example5{
    public static void main(String[] args){
        final String REGEX_PATTERN = "[fcl]oo";
        Pattern r = Pattern.compile(REGEX_PATTERN);
        try{
            FileReader fr = new FileReader("C:\\Regex\\Reg5.txt");
            BufferedReader br=new BufferedReader(fr);
            String line;
            while((line = br.readLine()) !=null){
                Matcher m =r.matcher(line);
                if(m.find()){
                    System.out.println(line);
                }
            }
            br.close();
        }
     catch(IOException e){
         e.printStackTrace();
     }
 }
}

 /* OUTPUT

PS C:\Regex> javac Example5.java
PS C:\Regex> java Example5      
foo
coo
loo
/*