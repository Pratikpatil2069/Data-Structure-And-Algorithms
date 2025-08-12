package JavaBasics;

class myThr extends Thread{
    public  myThr(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("*");
        }
    }
}
public class Multithreading_Constructor {
    public static void main(String[] args) {
        myThr t1=new myThr("pratik");
        myThr t2 = new myThr("kartik");
        t1.start();
        t2.start();

        System.out.println("my name is "+t1.getName());
        System.out.println("my name is "+t2.getName());

        System.out.println("my id is "+t1.getId());
        System.out.println("my id is "+t2.getId());

    }


}
