package JavaBasics;
import java.util.Scanner;
public class AdditionOfNnumbers {
    public  static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++)
        {
            sum=sum+i;
        }
        System.out.println("sum="+sum);
    }
}
