package JavaBasics;
import java.util.Scanner;
public class CreateCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the vlaue of a:");
        float a=sc.nextFloat();
        System.out.println("enter the value b");
        float b=sc.nextFloat();
        System.out.print("enter the choice:");
        System.out.println("+,-,*,/,%");
        String ch=sc.next();
        switch(ch)
        {
            case "+":
                System.out.println("Addition= "+(a+b));
                break;
            case "-":
                System.out.println("substraction= "+(a-b));
                break;
            case "*":
                System.out.println("multiplication= "+(a*b));
                break;
            case "/":
                System.out.println("dividion= "+(a/b));
                break;
            case "%":
                System.out.println("mod= "+(a%b));
                break;
            default:
                System.out.println("wrong input!");
        }
    }
}
