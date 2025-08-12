package JavaBasics;
import java.util.Scanner;
public class PrintReverseNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        while(num!=0)
        {
            System.out.println(num);
            num--;
        }
    }
}
