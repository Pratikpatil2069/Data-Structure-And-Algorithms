package JavaBasics;
import java.util.Scanner;
public class SumOfDigit{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int sum=0;
        int reminder=0;
        for(int i=0;num!=0;i++)
        {
            reminder=num%10;
            sum=sum+reminder;
            num=num/10;
        }
        System.out.println("sum="+sum);
    }
}