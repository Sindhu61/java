      Day 6
--------------------
    Pattern 1:
 --------------------
public class Pattern{
 public static void main(String[] args){
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j+" "); 
        }
          System.out.println();
    }
}
}

    OUTPUT:
--------------------

PS C:\517> javac Pattern.java
PS C:\517> java Pattern      
1 
1 2
1 2 3
1 2 3 4
1 2 3 4 5



    Pattern 2:
-----------------------

public class InvertedHalfPyramid{
      static  int n=5;
    public static void main(String[] args){
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j +" ");
             }
             System.out.println();
        }

    }
}

   OUTPUT:
---------------
PS C:\517> javac InvertedHalfPyramid.java
PS C:\517> java InvertedHalfPyramid      
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1


     Pattern 3:
-------------------------
import java.util.Scanner; 
 public class HollowHalfPyramid{
    public static void main(String[] args){
         int n;
     Scanner sc=new Scanner(System.in);
     n=sc.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=1;j<=i;j++){
              if(j==1 || j==i || i==n)
             System.out.print( j+ " ");
             else
                 System.out.print(" ");
              }
         System.out.println();
        }  
    }
}
   OUTPUT:
------------------------
PS C:\517> javac HollowHalfPyramid.java
PS C:\517> java HollowHalfPyramid
5
1
1 2       
1  3      
1   4     
1 2 3 4 5 


      Pattern 6:
-------------------------

import java.util.Scanner; 
 public class HollowHalfPyramid{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     for(int i=1;i<=n;i++){
         for(int j=i;j<=n;j++){
              if(i==1 || j==i || j==n)
             System.out.print(j+ " ");
             else
                 System.out.print("  ");
              }
         System.out.println();
        }  
    }
}

     OUTPUT:
---------------------
PS C:\517> javac HollowHalfPyramid.java
PS C:\517> java HollowHalfPyramid      
5
1 2 3 4 5 
2     5   
3   5     
4 5       
5