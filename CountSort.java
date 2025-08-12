package JavaBasics;
import java.util.Arrays;
import java.util.Scanner;
public class CountSort {
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
        int max=0;
        for (int i = 1; i < arr.length; i++) {
             max=arr[0];
            if(arr[i]>max){
                max=arr[i];
            }
        }
        int []a=new int [max+1];
        int count=0;
        for(int i=1;i<arr.length;i++){
            int num=arr[0];
            if(num==arr[i]){

            }
        }
    }

}
