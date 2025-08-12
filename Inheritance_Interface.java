package JavaBasics;

interface father{
    void meth1();
    void meth2();
}

interface son extends father{
    void meth3();
    void meth4();
}

class MySampleClass{
    public void meth1(){
        System.out.println("good morning");
    }
    public void meth2(){
        System.out.println("good afternoon");
    }
    public void meth3(){
        System.out.println("good night");
    }
    public void meth4(){
        System.out.println("pratik patil");
    }

}
public class Inheritance_Interface {
    public static void main(String[] args) {
        MySampleClass my=new MySampleClass();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
    }
}
