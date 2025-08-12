package JavaBasics;

class Student{
   private int id;
   private String name;
   // private key word is called access modifiers
    //private,public ,default,protected
    public void seter(int id, String name){
        this.id=id;
       this. name=name;
    }

    public void setId(int n){
        id=n;
    }
    public void setName(String myName){
        name=myName;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }


};
public class AccessModifire {
    public static void main(String[] args) {
        Student em =new Student();
       em.setId(10);
       em.setName("pratik");
       System.out.println("id="+em.getId()+"  name="+em.getName());
    }
}
