package JavaBasics;
import java.util.Scanner;

public class SumOfNmbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st number");
        int a=sc.nextInt();
        System.out.println("enter the 2nd number");
        int b=sc.nextInt();
        System.out.println("enter the 3rd number");
        int c=sc.nextInt();
        int sum=a+b+c;
        System.out.println("sum is equal to "+sum);
    }
}
