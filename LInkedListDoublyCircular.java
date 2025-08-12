package JavaBasics;

import java.util.Scanner;
class Node2{
    int data;
    Node2 next;
    Node2 prev;
    Node2 head=null;
    Scanner sc =new Scanner(System.in);
    Node2(){
        System.out.println("enter the number:");
        int num=sc.nextInt();
        this.data=num;
        this.next=null;
        this.prev=null;
    }

    Node2(int n){
        System.out.println("welcome to doubly circular linkedList!");
    }

    public void insertAtFirst(){
        Node2 newnode=new Node2();
        Node2  temp=head;
        if(head==null){
            head=newnode;
            newnode.next=head;
        }else {
            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.prev=temp;
            newnode.next = head;
            head.prev=newnode;
            head = newnode;

        }
        System.out.println("node is inserted at first!");
    }
    public void insertAtLast(){
        Node2 newnode=new Node2();
        Node2 temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=head;
        head.prev=newnode;
        System.out.println("node is inserted at last!");

    }
    public void insertAtRandom(){
        Node2 newnode=new Node2();
        System.out.println("enter the index which you want to  insert");
        int ind=sc.nextInt();
        Node2 temp,ptr;
        temp=head;
        ptr=temp.next;
        for(int i=1;i<ind-1;i++){
            temp=temp.next;
            ptr=ptr.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
        newnode.next=ptr;
        ptr.prev=newnode;
        System.out.println("node is inserted at give index!");
    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            Node2 temp = head;
            Node2 ptr=head;
            while (temp.next!=head){
                temp=temp.next;
            }
            head=head.next;
            temp.next=head;
            head.prev=temp;
            System.out.println("node is deleted at first!" + ptr.data);
        }

    }
    public void deletetAtLast(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            Node2 temp = head;
            Node2 ptr = temp.next;
            while (ptr.next != head) {
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = head;
            head.prev=temp;
            System.out.println("node is deleted at last!" + ptr.data);
        }

    }
    public void deleteAtRandom(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            System.out.println("enter the index which you want to  delete");
            int ind = sc.nextInt();
            Node2 temp, ptr;
            temp = head;
            ptr = temp.next;
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            ptr.next.prev=temp;
            System.out.println("node is deleted at give index!" + ptr.data);
        }

    }
    public void printList() {
        if (head == null) {
            System.out.println("no any number in list!");
        } else {
            Node2 temp = head;
            do{
                System.out.print(temp.data + "->");
                temp = temp.next;
            }while (temp != head);
//            System.out.println("in reverse order!");
//            Node2 temp1 = head;
//            while (temp1.next!=null){
//                temp1=temp1.next;
//            }
//            do  {
//                System.out.print(temp1.data + "->");
//                temp1 = temp1.prev;
//            }while (temp1 != temp1);
        }
    }

}
public class LInkedListDoublyCircular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node2 n=new Node2(0);
        int ch;
        for(int i=0;true;i++) {
            System.out.println("enter the choice:");
            System.out.println("1.insertAtfirst\n2.insertAtRandom\n3.insertAtLast\n4.deleteAtFirst\n5.deleteAtRandom\n6.deleteAtLast\n7printlist\n8.exit");
            ch=sc.nextInt();
            switch(ch) {
                case 1:
                    n.insertAtFirst();
                    break;
                case 2:
                    n.insertAtRandom();
                    break;
                case 3:
                    n.insertAtLast();
                    break;
                case 4:
                    n.deleteAtFirst();
                    break;
                case 5:
                    n.deleteAtRandom();
                    break;
                case 6:
                    n.deletetAtLast();
                    break;
                case 7:
                    n.printList();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("wrong input!");

            }
        }
    }
}
