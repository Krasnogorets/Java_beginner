import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class app3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Map<Character,Integer> rimNumber = new HashMap<>();
        rimNumber.put('I', 1);
        rimNumber.put('V', 5);
        rimNumber.put('X', 10);
        rimNumber.put('L', 50);
        rimNumber.put('C', 100);
        rimNumber.put('D', 500);
        rimNumber.put('M', 1000);
        String input = "CD";
        for (int index = 0; index < input.length(); index++) {
            char ch = input.charAt(index);
            list.add(rimNumber.get(ch));
        }
     
        int result=0;
        for (int index = 0; index < list.size(); index++) {
                if (index == list.size()-1){
                    result += list.get(index);
                }
                else if (list.get(index)<list.get(index+1)){
                    result -= list.get(index);

                }
                else{
                    result +=list.get(index);
                  
                }
        }
        System.out.println(result);
}
}
