package JavaBasics;

import java .util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        System.out.println("enter the  sorted array elements:");
        int []arr=new int[100];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("entered array elements:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);

        }
        int high=n-1;
        int low=0;
        int ind=-1;
        int flag=0;
        int mid;
        System.out.println("enter the number which you want to search:");
        int num=sc.nextInt();
        while(high>=low){
            mid=(high+low)/2;

            if(arr[mid]==num){
                ind=mid;
                flag=1;
                break;
            }
            if(arr[mid]<num){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        if(flag==1){
            System.out.println("entered number is found at index ="+ind);
        }else{
            System.out.println("number is not found in array!");
        }

    }
}
