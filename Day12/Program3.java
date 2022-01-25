     PROGRAM-3:
______________________________
import java.util.Scanner;
public class Program3{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        sc.close();
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int negativesubarrays=0;
        for(int i=0;i<n;i++){
                  int sum=a[i];
                  if(sum<0)
                      negativesubarrays++;
                for(int j=i+1;j<n;j++){
                     sum+=a[j];
                    if(sum<0)
                      negativesubarrays++;
                }
        }
                System.out.println(negativesubarrays);
                
     }
  }

   OUTPUT:
---------------------------------
PS C:\517> javac Program3.java
PS C:\517> java Program3      
5
1 -2 4 -5 1
9