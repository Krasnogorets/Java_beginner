import java.util.ArrayList;
import java.util.List;

public class app2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList <String>();
        list.add("земля");
        list.add("1");
        list.add("земля");
        list.add("земля");
        list.add("3");
        list.add("земля");
        list.add("45");
        list.add("земля");
        list.add("4");
        list.add("земля12");
        list.add("45");
        list.add("45");
        list.add("45");
        List <String> arr = new ArrayList<>();
        for (String item : list) {
            try {Integer.parseInt(item);
        
            } catch (Exception e) {
                arr.add(item);
            } 
        }
        System.out.println(arr);
        // list.replaceAll([01239],"");
    }
}
