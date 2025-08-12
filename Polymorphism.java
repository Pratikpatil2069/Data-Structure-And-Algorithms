package JavaBasics;

interface camera1{
    void takePhoto();
    void recordVideo();
    // if we set a method to interface then we update in alos all class,this overcome we add the default method in bellow.
    default void pratik(){
        System.out.println("my name is pratik");
    }

}

interface wifi1{
    String[] connection();
    void connectPhone(String network);
}

class cellPhone1{
    void call(){
        System.out.println("calling");
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class Smartphone1 extends cellPhone1 implements camera1,wifi1{
    public void takePhoto(){
        System.out.println("takeSnap");
    }
    public void recordVideo(){
        System.out.println("record video");
    }


    public void pratik() {
        System.out.println("my name is pratik annaso patil");
    }

    public String[] connection(){
        System.out.println("geting list of networks");
        String[] network={"pratik","kartik","patil"};
        return network;
    }
    public void connectPhone(String network){
        System.out.println("connecting to network"+network);
    }

}
public class Polymorphism {
    public static void main(String[] args) {
        camera1 cam1=new Smartphone1();
        cam1.takePhoto();
        cam1.recordVideo();
        cam1.pratik();
        //cam1.connectphone(); this is not allowed.

    }
}

