package JavaBasics;
import java.util.Scanner;

public class CalculatePercentage {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st subject marks");
        float s1=sc.nextFloat();
        System.out.println("enter the 2nd subject marks");
        float s2=sc.nextFloat();
        System.out.println("enter the 3rd suject marks");
        float s3=sc.nextFloat();
        System.out.println("enter the 4th suject marks");
        float s4=sc.nextFloat();
        System.out.println("enter the 5th suject marks");
        float s5=sc.nextFloat();
        float pre=(s1+s2+s3+s4+s5)/5;
        System.out.println("percentage of student is= "+pre);
    }
}
