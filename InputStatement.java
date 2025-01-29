package JavaBasics ;
import java.util.Scanner;
public class InputStatement{
    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the values");
        int a=sc.nextInt();
        float b=sc.nextFloat();
        boolean b1=sc.hasNextInt();
        sc.next();

        System.out.println(a);
        System.out.println(b);
        System.out.println(b1);

    }
}
