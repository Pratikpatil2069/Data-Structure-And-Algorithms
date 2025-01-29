package JavaBasics;

class base1{
     public base1(){
        System.out.println("i am a constructor of class base1");
    }

    public base1(int x){
        System.out.println("i am a constructor of class base1 and value of x is "+x);
    }
    public void name(){
        System.out.println("my name is pratik annaso patil");

    }
    public void goal(){
        System.out.println("my goal is placed in campus");
    }

}
class derived1 extends base1{
    public derived1(){
        super(0);
        System.out.println("i am a constructor of derived1");
    }
    public derived1(int y,int x){
        super(x);
        System.out.println("i am a constructor of class derived1 and value of y is "+y);
    }

}

class derived2 extends derived1{
    public derived2(){
        System.out.println("i am a constructor of derived2");
    }
    public derived2(int y,int x){
         super(y,x);
        System.out.println("i am a constructor of class derived2 and value of y is "+y);
    }
}

public class Constructors_In_inheritance {
    public static void main(String[] args) {
         //derived1 d1=new derived1();
        //derived1 d1=new derived1(10,11);
        derived2 d2=new derived2();
        // derived2 d2=new derived2(10,12);
       // d2.goal();

    }
}
