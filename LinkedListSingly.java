package JavaBasics;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node head=null;
    Scanner sc=new Scanner(System.in);
    Node(){
        System.out.println("enter the number:");
        int num=sc.nextInt();
        this.data=num;
        this.next=null;
    }
    Node(int n){
        System.out.println("Welcom to linked list!");
    }

    public void insertAtFirst(){
        Node newnode=new Node();
        newnode.next=head;
        head=newnode;
        System.out.println("node is inserted at first!");

    }

    public void insertAtLast(){
        Node newnode=new Node();
        Node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        System.out.println("node is inserted at last!");

    }

    public void insertAtRandom(){
        Node newnode=new Node();
        System.out.println("enter the index which you want to  insert");
        int ind=sc.nextInt();
        Node temp,ptr;
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
            Node temp = head;
            head = head.next;
            System.out.println("node is deleted at first!" + temp.data);
        }

    }

    public void deletetAtLast(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            Node temp = head;
            Node ptr = temp.next;
            while (ptr.next != null) {
                temp = temp.next;
                ptr = ptr.next;
            }
            temp.next = null;
            System.out.println("node is deleted at last!" + ptr.data);
        }

    }

    public void deleteAtRandom(){
        if(head==null){
            System.out.println("list underflow!");
        }else {
            System.out.println("enter the index which you want to  delete");
            int ind = sc.nextInt();
            Node temp, ptr;
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
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

}

 class LikedListSingly {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node n=new Node(1);
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