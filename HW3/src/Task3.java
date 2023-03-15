import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    static List<Integer> newList(List<Integer> newList, int listSize){
        for (int index = 0; index < listSize; index++) {
            newList.add(new Random().nextInt(1,40));
    
              }
        return newList;
    }
    static double getAverage(List<Integer> list) {
        return list.stream().mapToInt(a -> a).average().orElse(0);
    }
    public static void main(String[] args) {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
        List<Integer> myList = new ArrayList<Integer>();
        int listSize=20;
        System.out.println(newList(myList,listSize));
        myList.sort(null);
        System.out.println("минимальное число: " + myList.get(0));
        System.out.println("максимальное число: " + myList.get(listSize-1));
        System.out.println("средне-арифметическое: " + getAverage(myList));
    }

    
}
