package JavaBasics;

class RunnableInterface implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            System.out.println("*");

        }
    }
}

 class RunnableInterface1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(".");
        }
    }
}

class RunnableInterface2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("hi");
        }
    }
}
public class MultiThreading_RunnableInterface{
    public static void main(String[] args) {
        RunnableInterface r1=new RunnableInterface();
        Thread th1=new Thread(r1);

        RunnableInterface1 r2=new RunnableInterface1();
        Thread th2=new Thread(r2);

        RunnableInterface2 r3=new RunnableInterface2();
        Thread th3=new Thread(r3);

        th1.start();
        th2.start();
        th3.start();
    }
}