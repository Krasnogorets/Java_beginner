import java.util.LinkedList;
import java.util.Queue;

public class Task2 {
    static Queue<String> enQueue(Queue<String> myQueue, String str) {
        myQueue.add(str);
        return myQueue;

    }

    static String deQueue(Queue<String> myQueue) {
        String str = myQueue.element();
        myQueue.remove();
        return str;

    }

    static String first(Queue<String> myQueue) {
        // String str = myQueue.element();

        return myQueue.element();

    }

    public static void main(String[] args) {
        // Реализуйте очередь с помощью LinkedList со следующими методами:
        // • enqueue() — помещает элемент в конец очереди,
        // • dequeue() — возвращает первый элемент из очереди и удаляет его,
        // • first() — возвращает первый элемент из очереди, не удаляя.
        Queue<String> myQueue = new LinkedList<>();
        myQueue.offer("first");
        myQueue.offer("second");
        myQueue.offer("third");
        myQueue.offer("fourth");
        System.out.println(myQueue);
        enQueue(myQueue, "last");
        System.out.println(myQueue);
        System.out.println(deQueue(myQueue));
        System.out.println(myQueue);
        System.out.println(first(myQueue));

    }
}
