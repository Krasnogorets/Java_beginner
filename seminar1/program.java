package seminar1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;


import java.util.Random;

public class program {
    public static void main(String[] args) {
        System.out.println("Hello");
        int newClock = LocalTime.now().getHour();
        int newMinute = LocalTime.now().getMinute();
        newClock =18;
        // System.out.println(LocalDateTime.now().getYear());
        System.out.println(newClock);
        String timePeriod = null;
        if (newClock >= 5 && newClock <=11 && newMinute <= 59)  timePeriod = "Доброе утро";
        if (newClock >= 12 && newClock <=17 && newMinute <= 59)  timePeriod = "Добрый день";
        if (newClock >= 18 && newClock <=22 && newMinute <= 59)  timePeriod = "Добрый вечер";
        if (newClock == 23 && newMinute <= 59)  timePeriod = "Доброй ночи";
        if (newClock >= 0 & newClock <=4 & newMinute <= 59)  timePeriod = "Доброй ночи";
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("твое имя , чувак: ");
        String name = iScanner.nextLine();
        System.out.printf("%s, %s!", timePeriod, name);
        iScanner.close();
        int [] arr = {1,1,1,1,0,0,1,1,1,0,1,1,1,1,0};
        System.out.println(Arrays.toString(arr));
        int maxCount = 0;
        int count = 0;
        for (int index = 0; index < arr.length; index++) {
            if (arr[index]==1) {
                count ++;
                if (maxCount<count) maxCount=count;
            }
            else { 
                count =0;
            }
        }
        System.out.print(maxCount);
        Random random = new Random();
        Scanner iScanner = new Scanner(System.in);
        System.out.print("введи размер массива: ");
        int [] arr = new int[ new Scanner(System.in).nextInt()];
        for (int index = 0; index < arr.length; index++) {
            arr[index] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("введите число для телепортации: ");
        int val = new Scanner(System.in).nextInt();
        int teleportNumPos = arr.length-1;
        int tempVarPos = arr.length;
        int countC = 0;
        while (countC < teleportNumPos) {
        for (int index = 0; index < tempVarPos; index++) {
            if (arr[index] ==val) {
                for (int i = index+1; i <= teleportNumPos; i++) {
                    arr[i-1] = arr[i];
                }
                arr[teleportNumPos] = val;
                teleportNumPos-=1;
                tempVarPos = teleportNumPos;
            }
        }
        countC++;
        }
        System.out.println(Arrays.toString(arr));
        
        iScanner.close();
    }
}
