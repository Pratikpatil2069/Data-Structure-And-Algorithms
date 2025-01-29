package JavaBasics;
import java.util.Scanner;
public class WithoutArgumentAndWithoutReturnValue {
    static void multi(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int mul;
        mul=a*b;
        System.out.println("multiplication of "+a+" and "+b+" is =" +mul);
    }
    public static void main(String[] args){
        multi();
    }

}
