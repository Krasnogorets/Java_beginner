package programs;

import java.util.Arrays;
import java.util.Collections;


public class HW1_task5_add {

    public static void main(String[] args) {
        // во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке
        String inputS = "Добро пожаловать на курс по Java";
        String[] tempString = inputS.split(" ");
        Collections.reverse(Arrays.asList(tempString));
        System.out.println(Arrays.toString(tempString));
    }
}
