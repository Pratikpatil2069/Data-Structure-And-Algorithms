package JavaBasics;

class Myname{
    private int id;
    private String name;

    public Myname(int num , String myName){
        id=num;
        name=myName;
    }
//    public void set(int num , String Myname){
//        id=num;
//        name=Myname;
//    }

    //class name and method name is same is called constructor.
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
};
public class Constructor {
    public static void main(String[] args){
        Myname my=new Myname(10,"pratik");
       // my.set(11,"kartik");
        System.out.println(my.getId());
        System.out.println(my.getName());



    }
}
