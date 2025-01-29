package JavaBasics;
import java.util.Scanner;
public class BubbleSort {

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
    static void Sort(int []arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("sorted array!");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

}
