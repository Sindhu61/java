    Insertion Sort Example
----------------------------------
import java.util.Scanner;
public class Insertion{
    public static void Array(int arr[],int size){
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
    public static void sort(int arr[])
    {
        int n=arr.length;
        for(int j=1; j<n; j++)
        {
            int i=j-1;
            int key=arr[j];
            while((i>-1) && (arr[i]>key))
            {
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
        Array(arr,arr.length);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
        sc.close();
        sort(arr);
    }
}

   output:
---------------------
PS C:\517> javac Insertion.java
PS C:\517> java Insertion      
5
230
34
57
12
98
12 34 57 98 230 