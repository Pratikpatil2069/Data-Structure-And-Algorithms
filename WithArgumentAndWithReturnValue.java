package JavaBasics;
import java.util.Scanner;
public class WithArgumentAndWithReturnValue {
    static int multi(int a,int b){
        return (a*b);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("multiplication of "+a+" and "+b+" is "+multi(a,b));

    }
}
