package JavaBasics;
import java.util.Scanner;
public class IfStatment {
    public static void main(String[] args){
      Scanner sc= new Scanner(System.in);
        System.out.println("enter the age of person");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("person is eligible for voting");
        }
    }

}
