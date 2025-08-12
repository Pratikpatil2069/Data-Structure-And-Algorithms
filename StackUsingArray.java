package JavaBasics;
import java.util.Scanner;

class Stack3 {
    int top;
    int size;
    int[] arr;
    Scanner sc = new Scanner(System.in);

    Stack3(int n) {
        this.top = -1;
        this.size = n;
        this.arr = new int[n];
    }

    public void push(){
        if(this.top==this.size-1){
            System.out.println("Stack overflow");
        }else{
            System.out.println("enter the number:");
            int data=sc.nextInt();
            this.top++;
            this.arr[this.top]=data;
            System.out.println(data+" is pushed!");
        }
    }

    public void pop(){
        if(this.top==-1){
            System.out.println("Stack underflow");
        }else{
            int temp=this.arr[this.top];
            this.top--;
            System.out.println(temp+" is poped");
        }
    }
    public void pick(){
        if(this.top==-1){
            System.out.println("no any element in the Stack!");
        }else{
            System.out.println(this.arr[this.top]);
        }
    }

    public void display(){

        if(this.top==-1){
            System.out.println("stack is empty!");
        }else{
            for(int i=this.top;i>=0;i--){
                System.out.println(this.arr[i]);
            }
        }
    }
}
public class StackUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size Stack:");
        int n=sc.nextInt();
        Stack3 s3=new Stack3(n);
        int ch;
        for(int i=0;true;i++){
            System.out.println("enter the choice:");
            System.out.println("1.push\n2.pop\n3.pick\n4.display\n5.exit:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    s3.push();
                    break;
                case 2:
                    s3.pop();;
                    break;
                case 3:
                    s3.pick();
                    break;
                case 4:
                    s3.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("wromg input!");
            }
        }


    }
}
