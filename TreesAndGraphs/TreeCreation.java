package TreesAndGraphs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}
public class TreeCreation {

   public static void inorder(Node node){
       if(node==null){
           return;
       }
       inorder(node.left);
       System.out.print(node.data+" ");
       inorder(node.right);
   }

    public static void preorder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }

    public static void postorder(Node node){
        if(node==null){
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
    }

    public static void BFS(Node node){
        Queue<Node>queue=new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node node1=queue.poll();
            System.out.print(node1.data+" ");
            if(node1.left!=null){
                queue.add(node1.left);
            }
            if (node1.right!=null){
                queue.add(node1.right);
            }
        }

    }
    public static void leftSubtree(Node parentNode){
       Scanner sc=new Scanner(System.in);
        System.out.println("enter the left subtree data of "+parentNode.data);
        int data= sc.nextInt();
        parentNode.left=new Node(data);

        System.out.println("enter 1 for left subtree of "+data+" otherwise enter 0");
        int left= sc.nextInt();
        if(left==1){
            leftSubtree(parentNode.left);
        }

        System.out.println("enter 1 for right suntree of "+data+" otherwise enter 0");
        int right= sc.nextInt();
        if(right==1){
            rightSubtree(parentNode.left);
        }

    }

    public static void rightSubtree(Node parentNode){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the right subtree data of "+parentNode.data);
        int data= sc.nextInt();
        parentNode.right=new Node(data);

        System.out.println("enter 1 for left subtree of "+data+" otherwise enter 0");
        int left= sc.nextInt();
        if(left==1){
            leftSubtree(parentNode.left);
        }

        System.out.println("enter 1 for right subtree of "+data+" otherwise enter 0");
        int right= sc.nextInt();
        if(right==1){
            rightSubtree(parentNode.right);
        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the root element:");
        int num=sc.nextInt();
        Node root=new Node(num);
        System.out.println("enter 1 for left subtree of root otherwise 0");
        int left=sc.nextInt();
        if(left==1){
            leftSubtree(root);
        }else{
            root.left=null;
        }
        System.out.println("enter 1 for right subtree of root otherwise 0");
        int right=sc.nextInt();
        if(right==1){
            rightSubtree(root);
        }else{
            root.right=null;
        }

        while(true) {
            System.out.println("\nenter the choice to display tree in various order:");
            System.out.println("1.inorder\n 2.preorder \n 3.postorder\n 4.BFS\n 5.Exit");
            int ch= sc.nextInt();
            switch (ch){
                case 1:
                    inorder(root);
                    break;
                case 2:
                    preorder(root);
                    break;
                case 3:
                    postorder(root);
                    break;
                case 4:
                    BFS(root);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("please enter correct input:");
            }
        }
    }
}
