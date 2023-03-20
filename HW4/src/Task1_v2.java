import java.util.Collections;
import java.util.LinkedList;

public class Task1_v2 {
    static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        // Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который
        // вернёет «перевёрнутый» список.
        LinkedList<Integer> ll = new LinkedList<>();
        int sizeList = 10;
        for (int index = 0; index < sizeList; index++) {
            ll.add(index);
        }
        System.out.println(ll);
        System.out.println(reverseList(ll));
 

    }
}
