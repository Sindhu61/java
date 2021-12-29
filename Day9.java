     
              DAY-6 PROGRAMS
____________________________________________________________
1.Solid Rectangle
___________________________
   Program
--------------------
import java.util.Scanner;
public class SolidRectangle{
    static int rows,columns;
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        rows=sc.nextInt();
        columns=sc.nextInt();
          for(int i=0;i<rows;i++){
              for(int j=0;j<columns;j++){
                  System.out.print(" * ");
              }
              System.out.println("    ");
          }
              System.out.println();
    }
}  

    OUTPUT:
---------------------
PS C:\517> javac SolidRectangle.java
PS C:\517> java SolidRectangle      
Enter the number of rows and columns
3 5
 *  *  *  *  *     
 *  *  *  *  *     
 *  *  *  *  *         

 



2. Hollow Rectangle
__________________________
 Program:
----------------
import java.util.Scanner;
public class HollowRectangle{
     static int m,n;
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number of rows and columns");
      m =sc.nextInt();
      n =sc.nextInt();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || i==m-1 || j==0 || j==n-1)
                System.out.print(" * ");
              else
              System.out.print("   ");
        } 
        System.out.println();
         sc.close();
    }
    
}
}

       OUTPUT:
------------------------
PS C:\517> javac HollowRectangle.java
PS C:\517> java HollowRectangle      
Enter the number of rows and columns
3 5
 *  *  *  *  * 
 *           *
 *  *  *  *  *


3.Solid Diamond
___________________________
Program:
--------------
import java.util.Scanner;
 public class SolidDiamond{
     public static void main(String[] args){
           int i,j,k;
         Scanner sc= new Scanner(System.in);
          int n=sc.nextInt();
          for(i=0;i<n;i++){
               for(j=0;j<n-i-1;j++){
                   System.out.print(" ");
               }
                for(k=0;k<2*i+1;k++){
                    System.out.print("*");
                } 
                System.out.println("");  
               }
               for(i=n-1;i>0;i--){
                   for(j=n-1;j>=i;j--){
                       System.out.print(" ");
                   }
                     for(k=2*i-1;k>0;k--){
                         System.out.print("*");
                     }  
                     System.out.println("");
                   }
               }
            }     

    OUTPUT:
--------------------
PS C:\517> javac SolidDiamond.java
PS C:\517> java SolidDiamond      
10
         *
        ***
       *****
      *******
     *********
    ***********
   *************
  ***************
 *****************
*******************
 *****************
  ***************
   *************
    ***********
     *********
      *******
       *****
        ***
         *


4. HollowDiamond
____________________________

Program:
----------------
port java.util.Scanner;
 public class HollowDiamond{
     public static void main(String[] args){
           int i,j,k;
         Scanner sc= new Scanner(System.in);
          int n=sc.nextInt();
          for(i=1;i<=n;i++){
               for(j=i;j<=n;j++){
                   System.out.print(" ");
               }
                for(k=1;k<=i;k++){
                    if(i==1 || k==1 || k==n||i==k)
                    {
                      System.out.print(" * ");

                    }
                     else {
                     System.out.print("  "); 
                     }
               }
                  System.out.println();
            }
               for(i=1;i<=n;i++){
                   for(j=1;j<=i;j++){
                       System.out.print(" ");
                   }
                    for(k=n;k>=i;k--){
                          if(i==n || k==1 || k==n || i==k){
                         System.out.print(" * ");
                          }
                           else{
                          System.out.print("  ");
                           }
                   }
                   System.out.println();
               }
               sc.close();
            }
     }
     

    
