package JavaBasics;
import java.util.Scanner;
public class LogicalOperator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        if(num%2==0 && num%5==0)
        {
            System.out.println("entered number "+num+" is divisible by 2 and 5");
        }
        else
        {
            System.out.println("entered number "+num+" is not divisible by 2 and 5");
        }
    }
}
