package JavaBasics;
import java.util.Scanner;
public class ExceptionHandeling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        System.out.println("enter the index");
        int ind = sc.nextInt();
        System.out.println("enter the number to divide the array element at that index: ");
        int num = sc.nextInt();
        try {
            System.out.println("number is divide successfully " + arr[ind] / num);
        } catch (ArithmeticException e) {
            System.out.println("the arithmatic exception");
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("array index out of bound:");
            System.out.println(e);

        }

    }
}
