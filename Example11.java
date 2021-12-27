   Example11
----------------------
Program
---------------
import java.util.Scanner;
import java.text.NumberFormat;
public class Example11{
  public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
   double payment=sc.nextDouble();
    sc.close();
    String us=NumberFormat.getCurrencyInstance(locale.US).format(payment);
    String india=NumberFormat.getCurrencyInstance(new Locale("en")).format(payment);
    String china=NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
     String france=NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);
   System.out.println("US:" +us);
   System.out.println("INDIA:" +india);
   System.out.println("CHINA:" +china);
    System.out.println("FRANCE:" +france);
   }
}