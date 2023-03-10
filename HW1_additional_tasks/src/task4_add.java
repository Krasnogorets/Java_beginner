import java.util.Arrays;
import java.util.Scanner;

public class task4_add {
    static String[] findPrefix(String temp[], int m) {
        int longestPrefix = 0;
        int commonPrefixLen = 0;
        String result = "";
        String[] result1 = new String[3];
        String longestString="";
        for (String string1 : temp) {
            
            for (int index = string1.length(); index >= 0; index--) {
                String tempstring4 = string1.substring(0, index);
                int stringCount = 0;
                
                for (String string2 : temp) {
                    for (int index2 = string2.length(); index2 >= 0; index2--) {
                        String tempstring5 = string2.substring(0, index2);

                        if (tempstring4.equals(tempstring5)) {
                            stringCount++;
                            if (stringCount == m) {
                                commonPrefixLen = index;
                                if (string1.length()>longestString.length()){
                                    longestString=string1;
                                }

                                if (longestPrefix < commonPrefixLen) {
                                    longestPrefix = commonPrefixLen;
                                    result = tempstring4;

                                }
                            }
                        }
                    }
                }

            }
        }
        result1[1] = result;
        result1[2] = Integer.toString(longestPrefix);
        if (result == ""){
            result1[0] ="";
        } 
        else{
            result1[0] = longestString;}
        return result1;// возвращаю наибольшую строку с общим префиксом, общий префикс и длину префикса
    }

    public static void main(String[] args) throws Exception {
        // задание 4 написать метод, который находит самую длинную строку общего
        // префикса среди массива строк, если общего нет, вернуть пустую строку
        // String test = "написать метод, который находит самую длинную стр "
        // + " среди массива стро, префикса если общего нет, вернуть пустую строку";

        String test = "geek geekbrains geero ge geekbrainstry into";
        String[] tempString = test.split("[ ,]+");
        Arrays.sort(tempString);
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("вывести общий префикс для все слов строки (1) или хотя бы для двух (2)?: ");
        int n = iScanner.nextInt();
        int m =0;
        if (n == 1) {
            m = tempString.length;
        }
        else {
            m=n;
        }
        System.out.printf(Arrays.toString(findPrefix(tempString, m))); // вывожу наибольшую строку 
        //с общим префиксом, общий префикс и длину префикса
        iScanner.close();

    }

}
