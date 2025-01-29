package JavaBasics;

 abstract class parent{
    parent(){
        System.out.println("good morning");
    }
    public void myName(){
        System.out.println("my name is pratik patil");
    }
     abstract public void greet();
}

class child extends parent{
     public void greet(){
         System.out.println("good night");
     }

    public void name(){
        System.out.println("good afternoon");
    }

}
public class AbstractClass {
    public static void main(String[] args) {
        child ch = new child();
        // parent p=new parent() --this is  not allowed.
        ch.greet();
    }
}
