package JavaBasics;
import java.util.Scanner;
public class TraversalOfArray_2D {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:\n");
        int n=sc.nextInt();
        System.out.println("enter the array elements:\n");
        int [][]arr=new int[50][50];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("enterd array elements\n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println("\n");
        }

    }
}
