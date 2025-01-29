package JavaBasics;

//import java.util.Scanner;
import java.util.*;

class Stack1{
    ArrayList <Integer> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    public boolean isEmpty(){
        return list.size()==0;
    }

    public void push(){
        System.out.println("enter the number:");
        int num=sc.nextInt();
        list.add(num);
        System.out.println(num+" is pushed successfully");
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack underflow!");
        }else {
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            System.out.println(top + " is poped");
        }
    }

    public void pick(){
        if(isEmpty()){
            System.out.println("no element in Stack");
        }else{
            System.out.println(list.get(list.size()-1));
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("no element in Stack");
        }else{
            for(int i= list.size()-1;i>=0;i--){
                System.out.println(list.get(i));
            }
        }
    }
}
public class StackUsingArrayLIst {
    public static void main(String[] args) {
        Stack1 s1=new Stack1();
        Scanner sc=new Scanner(System.in);
        int ch;
        for(int i=0;true;i++){
            System.out.println("enter the choice:");
            System.out.println("1.push\n2.pop\n3.pick\n4.display\n5.exit:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    s1.push();
                    break;
                case 2:
                    s1.pop();;
                    break;
                case 3:
                    s1.pick();
                    break;
                case 4:
                    s1.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("wromg input!");
            }
        }

    }
}
