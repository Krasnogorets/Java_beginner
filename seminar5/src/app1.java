import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;


public class app1 {
    static boolean isExpresionTrue(String input)throws Exception {
        Map<Character,Character> isoTest = new HashMap<Character,Character>();
        isoTest.put('(',')');
        isoTest.put('[',']');
        isoTest.put('<','>');
        isoTest.put('{','}');
       LinkedList<Character> linkedList = new LinkedList<>();
       for (char ch : input.toCharArray()) {
         if(isoTest.containsKey(ch)){
            linkedList.push(ch);
         }
         else{
            if (isoTest.containsKey(ch) && linkedList.isEmpty()){
                
                    return false;
                }
                Character openBraskets = linkedList.pop();
                if(!isoTest.get(openBraskets).equals(ch)){
                    return false;
                }
            }
            }


       
        return true;
    }
    public static void main(String[] args) throws Exception{
        // a+(d*3) - true, [a+(1+3) - false написать программу проверки скобок, 
        // фактически кадой скобке должно соответсвовать закрывающая пара
        
        String input = "a+(1+3)";
        System.out.println(isExpresionTrue(input));

    

    }
}
