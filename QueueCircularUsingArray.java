package JavaBasics;

import java.util.Scanner;

class Queue2 {
    int size;
    int front;
    int rear;
    int []arr;
    Scanner sc=new Scanner(System.in);
    Queue2(int n){
        this.size=n;
        this.front=-1;
        this.rear=-1;
        this.arr=new int[n];
    }

    public void enqueue() {
        if((this.rear+1)%this.size==this.front) {
            System.out.println("Queue overflow!");
        }else {
            System.out.println("enter the number:");
            int num=sc.nextInt();
            if(this.rear==-1 && this.front==-1) {
                this.front=0;
                this.rear=0;
                this.arr[this.rear]=num;
            }else {
                this.rear=(this.rear+1)%this.size;
                this.arr[this.rear]=num;
            }
            System.out.println(num+" is enqueued!");
        }
    }

    public void dequeue() {
        if(this.front==-1) {
            System.out.println("Queue underflow!");
        }else {
            int temp;
            if(this.front==this.rear) {
                temp=this.arr[this.front];
                this.front=-1;
                this.rear=-1;
            }else {
                temp=this.arr[this.front];
                this.front=(this.front+1)%this.size;
            }
            System.out.println(temp+" is dequeued!");
        }
    }

    public void pick() {
        if(this.front==-1) {
            System.out.println("no any element in the queue!");
        }else {
            System.out.println(this.arr[this.rear]);
        }
    }

    public void display() {
        if(this.front==-1) {
            System.out.println("no any element in the queue!");
        }else {
            for(int i=this.front;i!=this.rear;i=(i+1)%this.size) {
                System.out.print(this.arr[i]+"\t");
                if(i+1==this.rear) {
                    System.out.print(this.arr[i+1]);
                }
            }
        }
    }

}
public class QueueCircularUsingArray {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of Queue:");
        int n=sc.nextInt();
        Queue2 q=new Queue2(n);
        int ch;
        for(int i=0;true;i++) {
            System.out.println("enter the choice:");
            System.out.println("1.enqueue\n2.dequeue\n3.pick\n4.display\n5.exit");
            ch=sc.nextInt();
            switch(ch) {
                case 1:
                    q.enqueue();
                    break;
                case 2:
                    q.dequeue();
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


