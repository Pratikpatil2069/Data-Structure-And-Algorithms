package JavaBasics;
class Employee {
    int id;
    String name;

    public void printDetails() {
        System.out.println("id=" + id + " name=" + name);
    }
}
public class ObjectOriented {
    public static void main(String[] args) {
        Employee em=new Employee();
        Employee pm=new Employee();
        em.id=10;
        pm.id=11;
        pm.name="kartik";
        em.name="pratik";
        em.printDetails();
        pm.printDetails();
       // System.out.println("id="+em.id+ " name="+em.name );
       // System.out.println("id="+pm.id+ " name="+pm.name );
    }

}
