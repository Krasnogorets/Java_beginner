import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

import java.util.Random;
import java.util.Set;

public class App {
    public static  int[]arr = new int[1000];
    public static Set<Integer> uniqueNum = new HashSet<>();
    
    public static void fillSet(){
        for (Integer item : arr) {
            uniqueNum.add(item);
        }
        System.out.println(uniqueNum);
        
    }
    public static void fillArray(){
        for (int i = 0; i < arr.length; i++) {
           arr[i] = new Random().nextInt(0,25);
        }
        
    }
    public static Double getPersentOfUnique(){
        Double result = Double.parseDouble(String.valueOf(uniqueNum.size()))*100 / arr.length;
        return result;
    }
    public static void main(String[] args) throws Exception {
        fillArray();
        fillSet();
        System.out.println(getPersentOfUnique());

    }
}
