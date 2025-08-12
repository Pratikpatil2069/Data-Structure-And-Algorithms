package JavaBasics;
import java .util.Scanner;
public class WithoutArgumentAndWithReturnValue {
    static int multi(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        return a*b;
    }
    public static void main(String[] args){
        System.out.println("multiplication of a and b is "+multi());
    }
}
