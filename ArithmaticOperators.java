package JavaBasics;
import java.util.Scanner;
public class ArithmaticOperators {
    public static void  main(String[] args){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the value of a ");
       int a=sc.nextInt();
       System.out.println("enter the value of a");
       int b=sc.nextInt();
        System.out.println("addition="+(a+b));
        System.out.println("substraction="+(a-b));
        System.out.println("multiplicaton="+(a*b));
        System.out.println("division="+(a/b));
        System.out.println("modulus="+(a%b));

    }
}
