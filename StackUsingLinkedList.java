package JavaBasics;
import java .util.Scanner;

class Node3 {
    int data;
    Node3 next;
    Scanner sc=new Scanner(System.in);

    Node3() {
        System.out.println("enter the number:");
        int num=sc.nextInt();
        this.data = num;
        this.next = null;
    }
}

class Stack{
    static Node3 head;
    public boolean isEmpty(){
        return head==null;
    }

   public void push(){
       Node3 newnode=new Node3();
        if(isEmpty()){
            head=newnode;
        }else{
            newnode.next=head;
            head=newnode;
        }
       System.out.println("number is pushed "+newnode.data);

   }

   public void pop(){
        if(isEmpty()){
            System.out.println("stack underflow!");
        }else{
            int top= head.data;
            head=head.next;
            System.out.println("number is poped "+top);
        }
   }

   public void pick(){
        if(isEmpty()){
            System.out.println("No element in stack");
        }else{
            System.out.println(head.data);
        }
   }

   public void display(){
       if(isEmpty()){
           System.out.println("No element in stack");
       }else{
           Node3 temp=head;
           while (temp!=null){
               System.out.println(temp.data);
               temp=temp.next;
           }
       }
   }

}
public class StackUsingLinkedList {
    public static void main(String[] args) {
        Stack s =new Stack();
        Scanner sc=new Scanner(System.in);
        int ch;
        for(int i=0;true;i++){
            System.out.println("enter the choice:");
            System.out.println("1.push\n2.pop\n3.pick\n4.display\n5.exit:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    s.push();
                    break;
                case 2:
                    s.pop();;
                    break;
                case 3:
                    s.pick();
                    break;
                case 4:
                    s.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("wromg input!");
            }
        }

    }
}
