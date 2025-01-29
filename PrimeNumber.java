package JavaBasics;
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int flag=0;
        int i;
        if(num==1 || num==0)
        {
            flag=0;
        }
        else {
            for (i=2; i<num/2; i++) {
                if (num % i == 0) {
                    flag = 1;
                    break;

                }
            }
        }
        if(flag==0)
        {
            System.out.println("entered number "+num+" is not prime number");
        }
        else {
            System.out.println("entered number "+num+" is prime number");
        }

    }
}
