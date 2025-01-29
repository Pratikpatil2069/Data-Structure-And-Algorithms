package JavaBasics;

import java .util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();

        System.out.println("enter the array elements:");
        int []arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("entered array elements:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        System.out.println("enter the array element which you want to search:");
        int num=sc.nextInt();
        int ind=-1,flag=0;

        for(int i=0;i<n;i++){
            if(num==arr[i]){
                ind=i;
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("number is found at ind =" +(ind));
        }else{
            System.out.println("number is not found in given array!");
        }


    }
}
