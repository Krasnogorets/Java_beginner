import java.util.HashMap;
import java.util.Map;

public class App {
    public static Boolean isIsomorth(String[] input){
        Map<Character,Character> isoTest = new HashMap<Character,Character>();
        if (input[0].length()!=input[1].length()){
            return false;
        }
        for (int index = 0; index < input[0].length(); index++) {
            char firstWorld = input[0].charAt(index);
            char secondWorld = input[1].charAt(index);
            if (isoTest.containsKey(firstWorld)){
                if (isoTest.get(firstWorld).equals(secondWorld)){
                    return false;
                }
            }
            else{
                isoTest.put(firstWorld,secondWorld);

            }
        }
            
        Map<Character,Character> isoTestRev = new HashMap<Character,Character>();
        for (int index = 0; index < input[0].length(); index++) {
            char firstWorld = input[1].charAt(index);
            char secondWorld = input[0].charAt(index);
            if (isoTestRev.containsKey(firstWorld)){
                if (!isoTestRev.get(firstWorld).equals(secondWorld)){
                    return false;
                }
            }
        }
            return true;
        
    }

    public static void main(String[] args) throws Exception {
        
        String[] input = {"foo","bar"};
        System.out.println(isIsomorth(input));

    
        }
        

    
}
