package JavaBasics;

import java.util.Scanner;
class Node4 {
    int data;
    Node4 next;
    Scanner sc=new Scanner(System.in);
    Node4(){
        System.out.println("enter the number:");
        int num=sc.nextInt();
        this.data=num;
        this.next=null;
    }
}

class Queue1 {
    Node4 head=null;
    Node4 tail=null;

    public void enqueue(){
        Node4 newnode=new Node4();
        if(head==null && tail==null){
            head=newnode;
            tail=newnode;
        }else{
            tail.next=newnode;
            tail=newnode;
        }
        System.out.println(newnode.data+" is enqueued!");
    }

    public void dequeue(){
        if(head==null){
            System.out.println("queue underflow!");
        }else{
            Node4 temp=head;
            head=head.next;
            System.out.println(temp.data+" is dequeued!");
        }
    }

    public void pick(){
        if(head==null){
            System.out.println("no any element in the Queue!");
        }else{
            System.out.println(tail.data);
        }
    }

    public void display(){
        if(head==null){
            System.out.println("no any element in the Queue!");
        }else{
            Node4 temp=head;
            while(temp!=null){
                System.out.print(temp.data+"\t");
                temp=temp.next;
            }
        }
    }

}
public class QueueUsingLinkedList {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue1 q=new Queue1();
        int ch;
        for(int i=0;true;i++){
            System.out.println("\nenter the choice:");
            System.out.println("1.enqueue\n2.dequeue\n3.pick\n4.display\n5.exit:");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();;
                    break;
                case 3:
                    q.pick();
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
