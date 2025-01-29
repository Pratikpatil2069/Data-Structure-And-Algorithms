package JavaBasics;
import java.util.Scanner;
public class SumOfNumberUsingRecursion {
    static int add(int a){
        if(a==0)
        {
            return 0;
        }
        return a+add(a-1);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number for addition:");
        int a=sc.nextInt();
        System.out.println("Addition= "+add(a));
    }
}
