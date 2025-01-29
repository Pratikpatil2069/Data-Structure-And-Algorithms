package JavaBasics;
import java.util.Scanner;
public class ArrayTraversal_1D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int []arr=new int [100];
        System.out.println("enter the array size:\n");
        int n=sc.nextInt();
        System.out.println("enter the array elements:\n");
        for(int i=0;i<n;i++)
        {
           arr[i]= sc.nextInt();
        }
        System.out.println("entered array elements:\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }

}
