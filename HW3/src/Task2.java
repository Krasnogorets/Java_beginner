import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    static List<Integer> deleteEven(List<Integer> newList){
        int j=0;
        while (j < newList.size()) {
            if (newList.get(j)%2==0){
                newList.remove(j);
                j--;
            }
            j++;
        }
        return newList;
    }
    public static void main(String[] args) {
        // Пусть дан произвольный список целых чисел, удалить из него чётные числа
        List<Integer> myList = new ArrayList<Integer>();
        int listSize=20;
        for (int index = 0; index < listSize; index++) {
            myList.add(new Random().nextInt(1,40));
              }
        System.out.println(myList);
        System.out.println(deleteEven(myList));
    }
}
