import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HW5app1 
{
    public static Map<String, List<String>> telBook = new HashMap<>();

    public static void main(String[] args) {
        addInPhoneBook();
        printAllBook();
        System.out.println();
        findInPhoneBook("Иванов");
    }

    public static void addInPhoneBook() {
        telBook.put("Иванов", List.of("12344", "456567888"));
        telBook.put("Петров", List.of("5464565466", "4565656"));
        telBook.put("Сидоров",List.of("456654", "4566456"));

    }
    public static void printAllBook() {
        for (String key : telBook.keySet()) {
            System.out.printf("%s: %s", key, telBook.get(key));
            System.out.println();
        }
       
    }

    public static void findInPhoneBook(String surname) {
        System.out.printf("%s: %s", surname, telBook.get(surname));
    }
}
