package JavaBasics;
import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string:");
        String str=sc.next();
        switch(str)
        {
            case "a":
                System.out.println(" is vowel");
                break;
            case "e":
                System.out.println("is vowel");
                break;
            case "i":
                System.out.println("is vowel");
                break;
            case "o":
                System.out.println("is vowel");
                break;
            case "u":
                System.out.println("is vowel");
                break;
            default:
                System.out.println("is consonant");
        }
    }
}
