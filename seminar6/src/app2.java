import java.util.HashSet;
import java.util.Set;

public class app2 {
    public static void main(String[] args) {
        Cat catOne = new Cat();
        catOne.setName("barsik");
        catOne.setAge(2);
        catOne.setWeight(3.4f);
        catOne.setOwner("Vasya");
        catOne.setHeight(23);
        catOne.setSex("male");
        Cat catTwo = new Cat();
        catTwo.setConstr(10, 12.1f, "Masha", "Juno", 14, "female");
        Cat cat3 = new Cat();
        cat3.setConstr(9, 9.1f, "Petya", "Koleso", 15, "male");
        Cat cat4 = new Cat();
        cat4.setConstr(9, 9.1f, "Petya", "Koleso", 15, "male");
        System.out.println(catOne);
        System.out.println(catTwo);
        Set <Cat> kotiki = new HashSet<Cat>();
        kotiki.add(catOne);
        kotiki.add(catTwo);
        kotiki.add(cat3);
        kotiki.add(cat4);
        System.out.println(kotiki);
        System.out.println(catOne.equals(catTwo));
        System.out.println(cat3.equals(cat4));
        System.out.println(cat4.hashCode());
        System.out.println(cat3.hashCode());
        System.out.println(cat3.getOwner());
  

    }
}
