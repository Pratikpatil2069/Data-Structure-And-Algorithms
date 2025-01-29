package JavaBasics;

import java.util.ArrayList;

class myThread1 extends Thread{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("*");
        }
    }
}

class myThread2 extends Thread {
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(".");
        }
    }

}
public class MultiThreading{
    public static void main(String[] args) {
     myThread1 th1 =new myThread1();
     myThread2 th2 =new myThread2();
     th1.start();
     th2.start();
    }
}
