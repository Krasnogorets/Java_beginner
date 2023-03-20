import java.util.LinkedList;

public class Task1 {
    static LinkedList<Integer> reverseList(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.getLast());
            list.removeLast();
        }
        return list;
    }

    public static void main(String[] args) throws Exception {
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
