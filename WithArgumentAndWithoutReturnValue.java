package JavaBasics;
import java.util.Scanner;
public class WithArgumentAndWithoutReturnValue {
    static void multi(int a,int b){
        System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
    }
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        multi(a,b);

    }
}
