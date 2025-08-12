package JavaBasics;
import java.util.Scanner;
public class FactorialUsingRecursion {
    static int fact(int num){
        if(num==1 || num==0)
        {
            return 1;
        }
        return num*fact(num-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System .in);
        System.out.println("enter the number to find factorial:");
        int num=sc.nextInt();
        System.out.println("factorial of num= "+fact(num));
    }
}
