package JavaBasics;
import java.util.Stack;
public class StackInbuilt {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.push(100);
        s.push(200);
        s.push(300);
        s.push(400);
        System.out.println(s);

        System.out.println(s.peek());

        s.pop();
        System.out.println(s);

    }
}
