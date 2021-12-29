   Bubble Sort Example
------------------------------
import java.util.Scanner;
public class Bubble{
    public static void Array(int arr[],int size){
        for(int i=0;i<size;i++)
        System.out.print(arr[i]+" ");
    }
    public static void sort(int arr[],int size){
        for(int i=0; i<size;i++){
            for(int j=0; j<size; j++){
                if(j!=size-1){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                }
            }
        }
        Array(arr,size);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array:");
        int size=sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements of the array:");
        for(int i=0; i<size; i++)
            arr[i]=sc.nextInt();
           sc.close();
        System.out.println("After sorting the array:");
        sort(arr,size);
    }
}

  Output:
-------------------
Enter size of the array:5
Enter the elements of the array:
98
54
12
567
340
After sorting the array:
12 54 98 340 567