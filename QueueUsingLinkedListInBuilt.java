package JavaBasics;
import javax.management.MBeanAttributeInfo;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingLinkedListInBuilt {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(100);
        q.offer(200);
        q.offer(300);
        q.offer(400);
        System.out.println(q);
        q.poll();
        System.out.println(q);

        System.out.println(q.peek());
    }
}
