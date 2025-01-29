package JavaBasics;
import java.util.Scanner;
public class LargestNumberInArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:\n");
        int n=sc.nextInt();
        System.out.println("entert the array elements:\n");
        int []arr= new int[100];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array elements:\n");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        int large=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>large)
            {
                large=arr[i];
            }
        }
        System.out.println("large="+large);
    }
}
