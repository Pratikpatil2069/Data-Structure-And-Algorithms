package JavaBasics;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to calculate factorial:");
        int num= sc.nextInt();
        int fact=1;
        for(int i=num;i>0;i--){
            fact=i*fact;
        }
        System.out.println("fact= "+fact);
    }
}
