package JavaBasics;
import java.util.Scanner;

public class ConditionalOperators {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        int max=a>b ? a:b;
        System.out.println(max);



    }
}
