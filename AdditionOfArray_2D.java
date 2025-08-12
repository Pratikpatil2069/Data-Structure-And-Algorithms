package JavaBasics;
import java.util.Scanner;
public class AdditionOfArray_2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n=sc.nextInt();
        System.out.println("enter the array elements:");
        int [][]arr=new int[3][3];
        int [][]array=new int[3][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("entered array 1:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.print("\n");
        }
        System.out.println("enter the 2nd array elements:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("entered array 2:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+array[i][j]);
            }
            System.out.print("\n");
        }
        int [][]sum=new int[3][3];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                sum[i][j]=arr[i][j]+array[i][j];
            }
        }
        System.out.println("addition of 1st and 2nd array:");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+sum[i][j]);
            }
            System.out.print("\n");
        }


    }

}
