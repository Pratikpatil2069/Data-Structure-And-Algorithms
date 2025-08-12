package JavaBasics;

class phone{
    public void name(){
        System.out.println("my name is pratik ");
    }
    public void calling(){
        System.out.println("take a phone and call to kartik");
    }

}

class smartphone extends phone{

    public void myname(){
        System.out.println("my name is prtaik");
    }
    public void calling(){
        System.out.println("take a smartphone and call to kartik");
    }
}
class mobile extends smartphone{

    public void nameMy(){
        System.out.println("pratik is my name");
    }

    public void calling(){
        System.out.println("take a mobile and call to kartik");
    }
}
public class Dynamic_method_dispatch {
    public static void main(String[] args) {
        phone ph=new mobile();
       ph.name(); //this call only allowed.means in phone class all methods are allowed.
       ph.calling();// and this.

    }
}
