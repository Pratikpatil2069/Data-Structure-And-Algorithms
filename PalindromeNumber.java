package JavaBasics;
import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num =sc.nextInt();
        int original=num;
        int re,dup=0;
        for(int i=0;num!=0;i++){
            re=num%10;
            dup=re+dup*10;
            num=num/10;
        }
        if(original==dup)
        {
            System.out.println("entered number "+original+" is palindrome number");
        }
        else
        {
            System.out.println("entered number "+original+" is not palindrome number");
        }
    }
}
