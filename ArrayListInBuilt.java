package JavaBasics;
import java.util.ArrayList;
public class ArrayListInBuilt {
    public static void main(String[] args) {
        ArrayList <Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(10);
        System.out.println(list);
        list.add(1,100);
        System.out.println(list);
        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(200);
        list2.add(300);

        list.addAll(list2);
        System.out.println(list);

        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        list.remove(Integer.valueOf(200));
        System.out.println(list.remove(Integer.valueOf(200)));
        System.out.println(list);

        list.set(1,1000);
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
