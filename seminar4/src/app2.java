import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
    //         Реализовать консольное приложение, которое:
    // Принимает от пользователя и “запоминает” строки.
    // Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
    // Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> ll = new LinkedList<String>();
        Scanner newScan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.printf("введите строку: ");
            String str = newScan.nextLine();
            if (str.contains("print")){
            //    System.out.println(ll.getLast());
            //     for (int index = 1; index < ll.size()-1; index++) {
            //         System.out.println(ll.get(index));
            //     }
            //    System.out.println(ll.getFirst());
            // Iterator<String> listIterator = ll.descendingIterator();
            // while (listIterator.hasNext()) 
            // {
            //     System.out.println(listIterator.next());
            // }
            Collections.reverse(ll);
            System.out.println(ll);
            Collections.reverse(ll);

                    flag = false;
            }
            else if (str.contains("revert")){
               try {ll.removeLast();
                System.out.println(ll);
                flag = false;
                
               } catch (Exception e) {
                System.out.println("нечего удалять");
               } 

            }
            else {
                ll.add(str);
            }

        }
        newScan.close();

    }
}
