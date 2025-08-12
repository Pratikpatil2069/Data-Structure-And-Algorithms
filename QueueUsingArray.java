package JavaBasics;
import java.util.Scanner;

class Queue{
    int rear;
    int front;
    int []arr;
    int size;
    Scanner sc=new Scanner(System.in);

    Queue(int n){
       this. size=n;
       this. arr=new int[n];
       this. rear=-1;
       this.front=-1;
    }

    public void enqueue(){
       if(this.rear==this.size-1){
           System.out.println("queue is overflow!");
       }else{
           System.out.println("enter the number:");
           int num=sc.nextInt();
           if(this.rear==-1){
               this.rear++;
               this.front++;
               this.arr[this.rear]=num;
           }else{
               this.rear++;
               this.arr[this.rear]=num;
           }
           System.out.println(num+" is enqueued!");
       }

    }

    public void dequeue(){
        if(this.front==-1){
            System.out.println("Queue Underflow!");
        }else{
            int temp;
            if(this.rear==this.front){
                temp=this.arr[this.front];
                this.rear=-1;
                this.front=-1;
            }else{
                temp=this.arr[this.front];
                this.front++;
            }
            System.out.println(temp+"is dequeued!");
        }
    }

    public void pick(){
        if(this.front==-1){
            System.out.println("Queue Underflow!");
        }else{
            System.out.println(this.arr[this.rear]);
        }
    }

    public void display(){
        if(this.front==-1){
            System.out.println("no any element in queue!");
        }else{
            for(int i=this.front;i<=this.rear;i++){
                System.out.print(this.arr[i]+"\t");
            }
        }
    }
}


public class QueueUsingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the size of Queue:");
        int n=sc.nextInt();
        Queue2 q=new Queue2(n);
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
