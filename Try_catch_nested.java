package JavaBasics;
import java .util.Scanner;
public class Try_catch_nested {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        arr[0]=39;
        arr[1]=358;
        arr[2]=598;
        System.out.println("enter the array index:");
        int ind =sc.nextInt();
        try{
            System.out.println("level 1 executed:");
            try {
                System.out.println("array element at index is "+arr[ind]);
            }catch(Exception e){
                System.out.println("level 2");
                System.out.println(e);

            }
        }catch(Exception e){
            System.out.println("array element at index is level 1 "+arr[ind]);
            System.out.println(e);
        }

    }
}
