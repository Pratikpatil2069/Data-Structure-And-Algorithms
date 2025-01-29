package JavaBasics;

import java.util.Scanner;

class LinkedNode {
    int data;
    LinkedNode next;
    LinkedNode head=null;
    Scanner sc=new Scanner(System.in);
    LinkedNode(int n){
        this.data=n;
        this.next=null;
    }
    LinkedNode(){
        System.out.println("welcome to linked list!");
    }

    public void insertAtFirst(){
        System.out.println("enter the number:");
        int n= sc.nextInt();
        LinkedNode newnode=new LinkedNode(n);
        LinkedNode temp=head;
        if(head==null){
            head=newnode;
            newnode.next=head;
        }else {


            while (temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next = head;
            head = newnode;

        }
        System.out.println("node is inserted at first!");
    }

    public void insertAtLast(){
        System.out.println("enter the number:");
        int n= sc.nextInt();
        LinkedNode newnode=new LinkedNode(n);
        LinkedNode temp=head;
        while (temp.next!=head){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.next=head;
        System.out.println("node is inserted at last!");

    }

    public void insertAtRandom(){
        System.out.println("enter the number:");
        int n= sc.nextInt();
        LinkedNode newnode=new LinkedNode(n);
        System.out.println("enter the index which you want to  insert");
        int ind=sc.nextInt();
        LinkedNode temp,ptr;
        temp=head;
        ptr=temp.next;
        for(int i=1;i<ind-1;i++){
            temp=temp.next;
            ptr=ptr.next;
        }
        temp.next=newnode;
        newnode.next=ptr;
        System.out.println("node is inserted at give index!");

    }
    public void deleteAtFirst(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            LinkedNode temp = head;
            LinkedNode ptr=head;
            while (temp.next!=head){
                temp=temp.next;
            }
            head=head.next;
            temp.next=head;
            System.out.println("node is deleted at first!" + ptr.data);
        }

    }

    public void deletetAtLast(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            LinkedNode temp = head;
            LinkedNode ptr = temp.next;
            while (ptr.next != head) {
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = head;
            System.out.println("node is deleted at last!" + ptr.data);
        }

    }

    public void deleteAtRandom(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            System.out.println("enter the index which you want to  delete");
            int ind = sc.nextInt();
            LinkedNode temp, ptr;
            temp = head;
            ptr = temp.next;
            for (int i = 1; i < ind - 1; i++) {
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = ptr.next;
            System.out.println("node is deleted at give index!" + ptr.data);
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("no any number in list!");
        } else {
            LinkedNode temp = head;
            do  {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }while (temp != head);

        }
    }

}

class LikedListSinglyCircular {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedNode n=new LinkedNode();
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
