import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Collections;


public class HW5app2 {

    public static Map<String, String> listOfEmploee = new HashMap<>();
    public static Set<String> names = new HashSet<>();
    public static Map<String, Integer> countNames = new HashMap<>();
    public static void addInList() {
        listOfEmploee.put("Иванов","Иван");
        listOfEmploee.put( "Петрова","Светлана");
        listOfEmploee.put("Белова", "Кристина");
        listOfEmploee.put("Мусина", "Анна");
        listOfEmploee.put("Крутова", "Анна");
        listOfEmploee.put("Юрин", "Иван");
        listOfEmploee.put("Лыков", "Петр");
        listOfEmploee.put("Вернов","Павел");
        listOfEmploee.put("Чернышов", "Петр");
        listOfEmploee.put("Федотова", "Мария");
        listOfEmploee.put("Светлова", "Марина");
        listOfEmploee.put("Савина", "Мария");
        listOfEmploee.put("Рыкова", "Мария");
        listOfEmploee.put("Лугова", "Марина");
        listOfEmploee.put("Владимирова","Анна");
        listOfEmploee.put("Мечников", "Иван");
        listOfEmploee.put("Петин", "Петр");
        listOfEmploee.put("Рыжов", "Иван");

    }
    public static void fillMapAndCheck() {
        names.addAll(listOfEmploee.values());
        for (String name : names) {
            countNames.put(name, Collections.frequency(listOfEmploee.values(), name));
        }

    }
    public static void main(String[] args) {
        addInList();
        fillMapAndCheck();
        countNames.entrySet().stream().sorted(Map.Entry.<String, Integer>comparingByValue().reversed()).forEach(System.out::println);
      

    }
}
