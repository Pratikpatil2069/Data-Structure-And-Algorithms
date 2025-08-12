package JavaBasics;

import org.w3c.dom.ls.LSOutput;

class base{
    int id;

    public void set(){
        System.out.println("my name is pratik patil");
    }
    public void get(){
        System.out.println("my brother name is kartik");
    }
}

class derived extends base{
  int y;
}
public class Inheritance {
    public static void main(String[] args){
        base in = new base();
        in.get();
        in.set();
        derived de =new derived();
        de.get();
        de.set();

    }

}
