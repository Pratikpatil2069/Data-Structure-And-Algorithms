package JavaBasics;
import java.util.Scanner;
public class LargestNumberInThree {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1:");
        int a=sc.nextInt();
        System.out.println("enter the number 2:");
        int b=sc.nextInt();
        System.out.println("enter the number 3:");
        int c=sc.nextInt();
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is Largest");
            }
            else
            {
                System.out.println(c+" is Largest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b+" is Largest");
            }
            else
            {
                System.out.println(c+" is Largest" );
            }
        }
    }
}
