package JavaBasics;

class pratik{
    public void name(){
        System.out.println("the name of this boy is pratik");
    }

    public void fullName(){
        System.out.println("the full name of this boy is pratik annaso patil");
    }
}

class kartik extends pratik{
    public void name(){
        System.out.println("the of this boy is kartik");
    }
    public void fullName(){
        System.out.println("the full name of this boy is kartik annaso patil");
    }
        }
public class Methode_Overriding {
    public static void main(String[] args){
       // pratik p=new pratik();
       // p.name();
        kartik k=new kartik();
        k.name(); //reference class method run not a base class method is called method overriding.


    }
}
