import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class app3 {
    public static void main(String[] args) {
//         1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
        int [] arr  = new int []{1,45,3,78,23,78,9,0,2,4};
        Stack<Integer> myStack = new Stack<Integer>();
        for (int index : arr) {
            myStack.add(index);
            
        }
        System.out.println(myStack.getClass());
        System.out.println(myStack);
        Queue<Integer> myQueue = new LinkedList<>();
        for (int index : arr) {
            myQueue.add(index);
            
        }
        System.out.println(myQueue.getClass());
        System.out.println(myQueue);

        
        


    }
}
