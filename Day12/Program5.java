      PROGRAM-5
__________________________________

import java.util.Scanner;
public class Program5{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int pd=0,sd=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(j==i)
                 pd=pd+a[i][j];
            }
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==n-j-1){
                    sd=sd+a[i][j];
                }
            }
        }
             int dif=sd-pd;
             dif=Math.abs(dif);
             System.out.println(dif);
         }
    }

  OUTPUT:
-------------------------
PS C:\517> javac Program5.java
PS C:\517> java Program5      
3
11 2 4
4 5 6
10 8 -12
15


PS C:\517> java Program5
3
1 2 3
4 5 6
9 8 9
2