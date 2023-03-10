import java.util.Arrays;


public class task4_add {
   static String[] findPrefix(String temp[]){
    int longestPrefix=0; 
    int commonPrefixLen=0;
    String result ="";  
    String[] result1 = new String [2];
    
    for (String string1 : temp) {
        
            for (int index = string1.length(); index >= 0 ; index--) {
                String tempstring4 = string1.substring(0, index);
                // System.out.println(" "+tempstring4+" "+ longestPrefix);
                int stringCount=0;
                for (String string2 : temp) {
                    for (int index2 = string2.length(); index2 >= 0 ; index2--) {
                        String tempstring5 = string2.substring(0, index2);
                        // System.out.println(" "+tempstring4+" "+ longestPrefix);
                    // System.out.println(" "+tempstring4+" "+ longestPrefix);
                        if (tempstring4.equals(tempstring5) ){
                            stringCount++;
                            if  (stringCount == temp.length) {
                                commonPrefixLen = index;
                                if (longestPrefix <commonPrefixLen){
                                    longestPrefix=commonPrefixLen;
                                    result = tempstring4;
                                    
                                }
                            }
                        }
                 }
                }
                
            }
        }
        result1[0]=result;
        result1[1]=Integer.toString(longestPrefix);
        return result1;// возвращаю и общий префикс и размер
   }

    public static void main(String[] args) throws Exception {
        // задание 4 написать метод, который находит самую длинную строку общего
        // префикса среди массива строк, если общего нет, вернуть пустую строку
        String test = "написать метод, который находит самую длинную стр "
                + " среди массива стро, префикса если общего нет, вернуть пустую строку";

        // String test = "geek geekbrains geero";      
        String[] tempString = test.split("[ ,]+");
        Arrays.sort(tempString);
        String result[] =findPrefix(tempString);
        System.out.printf("префикс: s%, длига общего префикса: s%", result[0],result[1]);
    

    }

}
