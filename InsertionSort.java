package JavaBasics;
import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int []arr=new int [n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("entered the array Elements: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"\t");
        }
        Sort(arr);
    }
    static void Sort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int min=arr[i];
            int ind=i;
            for(int j=i-1;j>=0;j--){
                if(min<arr[j]){
                    arr[j+1]=arr[j];
                    ind=j;
                }
            }
            arr[ind]=min;
        }
        System.out.println("\nsorted array elements:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
}
