package src.arrays;
import java.util.ArrayList;

public class arrayLists {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(78);
        list.add(98);
        list.add(7788);
        list.add(12345);
        list.add(345);
        list.add(86);
        list.add(07);
        list.add(456);
        list.add(968);
        list.add(78);

        list.addFirst(45667667);
        // list.size();

        System.out.println(list);

        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }
    
    }
}
