package JavaBasics;
import java.util.Scanner;
public class AdditionOf1DArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:\n");
        int n=sc.nextInt();
        int sum=0;
        System.out.println("enter the array elements:\n");
        int []arr=new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("entered array elements:\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("Addition of array elements:\n");
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("sum="+sum);
    }
}
