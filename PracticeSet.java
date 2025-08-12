package JavaBasics;

abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
     void changeNib(){
         System.out.println("founding pen");
     }
     void write(){
         System.out.println("write using pen");

     }
     void refill(){
         System.out.println("refill");
     }

}
class Monkey{
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("biting");
    }

}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey{
    void speak(){
        System.out.println("hello sir");
    }
    void eat(){
        System.out.println("eat");
    }
    void sleep(){
        System.out.println("sleep");
    }

}
public class PracticeSet {
    public static void main(String[] args) {
       // FountainPen fp=new FountainPen();
       // fp.changeNib();
        Human h=new Human();
        h.speak();
        h.eat();
        Monkey m=new Human();
        m.bite();
        m.jump();
        Pen p1=new FountainPen();
        p1.refill();
        p1.write();
    }
}
