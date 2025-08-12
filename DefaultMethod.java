package JavaBasics;

interface camera{
    void takePhoto();
    void recordVideo();
    // if we set a method to interface then we update in alos all class,this overcome we add the default method in bellow.
    default void pratik(){
        System.out.println("my name is pratik");
    }

}

interface wifi{
    String[] connection();
    void connectPhone(String network);
}

class cellPhone{
    void call(){
        System.out.println("calling");
    }
    void pickCall(){
        System.out.println("connecting...");
    }
}

class Smartphone extends cellPhone implements camera,wifi{
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
public class DefaultMethod {
    public static void main(String[] args) {
      Smartphone sm=new Smartphone();
      //sm.pickCall();
//       String []arr= sm.connection();
//        for(String item:arr){
//            System.out.println(item);
        sm.pratik();

    }
}
