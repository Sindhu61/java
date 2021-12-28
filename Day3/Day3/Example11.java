   Example11
-------------------
import java.util.*;
import java.text.*;
public class Example11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double payment= sc.nextDouble();
        NumberFormat france= NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat us= NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china= NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat india= NumberFormat.getCurrencyInstance(new Locale("en"));
        System.out.println("US: "+us.format(payment));
        System.out.println("India: "+india.format(payment));
        System.out.println("China : "+china.format(payment));
        System.out.println("France: "+france.format(payment));
        sc.close();
        }
}

  Output
------------------
PS C:\517> javac Example11.java
PS C:\517> java Example11      
12324.134
US: $12,324.13
India: ¤12,324.13
China : ¥12,324.13
France: 12?324,13 ?