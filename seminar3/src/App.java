import java.util.Random;
import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> list3 = new ArrayList<Integer>();
        for (int index = 0; index < 10; index++) {
    
            list3.add(new Random().nextInt(1,40));
        }
        System.out.println(list3);
        list3.sort(null);
        System.out.println(list3);
    

    


    }
}
