package JavaBasics;
import java.util.Scanner;

class Node8 {
    int data;
    Node8 next;
    Scanner sc = new Scanner(System.in);

    Node8() {
        System.out.println("enter the number:");
        int num = sc.nextInt();
        this.data = num;
        this.next = null;
    }
}
class Queue3{
    Node8 head=null;
    Node8 tail=null;
    public void enqueue(){
        Node8 newnode=new Node8();
           if(head==null && tail==null){
               head=newnode;
               tail=newnode;
        }else{
              head.next=newnode;
              head=newnode;
           }
        System.out.println(head.data+"is enqueue!");
    }
    public void dequeue(){

       if(this.tail==null){
           System.out.println("Queue is underflow!");
       }else{
           Node8 temp=tail;
           tail=tail.next;
           System.out.println(temp.data+"is dequeue!");
       }


    }
    public void peek(){
        if(this.tail==null){
            System.out.println("Queue is underflow!");
        }else{
            System.out.println(tail.data);
        }
    }

    public void display(){
        if(this.tail==null){
            System.out.println("Queue is underflow!");
        }else{
            Node8 temp=tail;
           while (temp!=null){
               System.out.print(temp.data+"\t");
               temp=temp.next;
           }
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Queue3 q=new Queue3();
        int ch;
        for (int i = 0; true ; i++) {
            System.out.println("enter the choice:");
            System.out.println("1.enqueue\n2.dequeue\n3.peek\n4.display\n5.exit:");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("wrong input!");
            }
        }
    }
}