package JavaBasics;
import java.util.Scanner;
public class SquareAndCube {
    static int cube(int a){
        return a*a*a;
    }
    static int square(int a){
        return a*a;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a=sc.nextInt();
        System.out.println("Square= "+square(a));
        System.out.println("cube= "+cube(a));
    }
}
