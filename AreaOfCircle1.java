package JavaBasics;
import java.util.Scanner;
public class AreaOfCircle1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the radius of circle");
        float r=sc.nextInt();
        float area=3.14f*(r*r);
        System.out.println("area="+area);

    }
}
