package JavaBasics;

public class Try_Catch {
    public static void main(String[] args) {
        int a=1000;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        catch (Exception e){
            System.out.println("we failed to divide .reason:");
            System.out.println(e);
        }
        System.out.println("end of programm");
    }
}
