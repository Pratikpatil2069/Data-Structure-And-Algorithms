package TreesAndGraphs;

import java.util.Scanner;

import java.util.Scanner;
class Node1{
    int data;
    Node1 left;
    Node1 right;
    Node1(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

}

public class BinarySearchTree {
    public static void createBST(int data1, Node1 root){
        if(data1<root.data){
            if(root.left==null){
                Node1 newNode=new Node1(data1);
                root.left=newNode;
            }else {
                createBST(data1, root.left);
            }
        }else{
            if(root.right==null){
                Node1 newNode=new Node1(data1);
                root.right=newNode;
            }else{
                createBST(data1,root.right);
            }
        }

    }

    public static void inorder(Node1 root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Root Element Of BST:");
        int data=sc.nextInt();
        Node1 root=new Node1(data);
        while (true){
            System.out.println("If you Want To Add New Elements Then choose 1 OtherWise 0:");
            int ch=sc.nextInt();
            if(ch==1){
                System.out.println("Enter the Elements that Add in BST");
                int data1=sc.nextInt();
                createBST(data1,root);
            }else{
                inorder(root);
                System.exit(0);
            }

        }

    }
}
