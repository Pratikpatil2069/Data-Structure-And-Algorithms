package JavaBasics;

class myThr1 extends Thread{
    public  myThr1(String name) {
        super(name);
    }
    public void run(){
        System.out.println("my name is "+this.getName());
        }
    }

public class MultiThreading_Priorities {
    public static void main(String[] args) {
        myThr1 t1=new myThr1("pratik");
        myThr1 t2 = new myThr1("kartik1");
        myThr1 t3 = new myThr1("kartik2");
        myThr1 t4 = new myThr1("kartik3");
        myThr1 t5 = new myThr1("kartik4");
        t5.setPriority(Thread.MAX_PRIORITY);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t2.start();
        t2.start();
        t2.start();




    }

}
