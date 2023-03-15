import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
public class app1 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList <String>();
        planets.add("земля");
        planets.add("юпитер");
        planets.add("юпитер");
        planets.add("сатурн");
        planets.add("марс");
        planets.add("марс");
        planets.add("меркурий");
        planets.add("меркурий");
        planets.add("меркурий");
        planets.add("венера");
        planets.add("уран");
        planets.add("нептун");
        planets.add("нептун");
        Set <String> planetsRight = new HashSet<>(planets);
        for (String item : planetsRight) {
                System.out.println(item +" " +Collections.frequency(planets, item)); 
            }
       
        
        
    }
}
