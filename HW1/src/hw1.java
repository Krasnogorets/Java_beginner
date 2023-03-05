import java.util.Scanner;
import java.time.LocalTime;
import java.util.Arrays;

public class hw1 {
    static int funcSum(int num) {
        if (num == 0)
            return 0;
        return num + funcSum(num - 1);
    }

    static long factor(long n) {
        if (n == 1)
            return 1;
        return (n * factor(n - 1));
    }
    static void calculation(double arg1,double arg2, String mark){
        
        switch (mark) {
            case "+":
                System.out.printf("ответ: %s \n",arg1+arg2);
               return;
            case "-":
                System.out.printf("ответ: %s \n",arg1-arg2);
                return;
            case "*":
                System.out.printf("ответ: %s \n",arg1*arg2);
                return;
            case "/":
                System.out.printf("ответ: %s \n",arg1/arg2);
                return;
        }
        // return result;
    }
    static void convertAndCheck(String arg1, String arg2, int result){ // метод для числа любой разрядности и любого расположения ?
        char[] myCharArray = {'0','1','2','3','4','5','6','7','8','9'};
        int indexOfQstMark1 = arg1.indexOf("?");
        int indexOfQstMark2 = arg2.indexOf("?");
        char[] chars1 = arg1.toCharArray();
        char[] chars2 = arg2.toCharArray();
           for (int countForward = 0; countForward < 10; countForward++) {
            for (int countBackward = 0; countBackward < 10; countBackward++) {
                chars1[indexOfQstMark1]=myCharArray[countForward];
                int num1 = Integer.parseInt (String.valueOf(chars1));
                chars2[indexOfQstMark2]=myCharArray[countBackward];
                int num2 = Integer.parseInt (String.valueOf(chars2));
                if (num1+num2 == result ){
                    System.out.printf("%s + %s = %s", num1, num2,result);
                    return;
                }
            }
            }
  
        System.out.println("значений не найдено");
        return;

    }
    public static void main(String[] args) throws Exception {
        // задание с семинара 1
        // int newClock = LocalTime.now().getHour();
        // int newMinute = LocalTime.now().getMinute();
        // int minuteLimit = 59;
        // String timePeriod = null;
        // if (newClock >= 5 && newClock <=11 && newMinute <= minuteLimit)
        // {timePeriod = "Доброе утро";}// здесь пока оставил магические числа
        // if (newClock >= 12 && newClock <=17 && newMinute <= minuteLimit) { timePeriod
        // = "Добрый день";}
        // if (newClock >= 18 && newClock <=22 && newMinute <= minuteLimit) {timePeriod
        // = "Добрый вечер";}
        // if ((newClock == 23 || newClock >= 0 & newClock <=4 ) && newMinute <=
        // minuteLimit) {timePeriod = "Доброй ночи";}
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("Как вас зовут: ");
        // String name = iScanner.nextLine();
        // System.out.printf("%s, %s!", timePeriod, name);

        // задание с семинара 2
        // int [] arr = {1,1,1,1,0,0,1,1,1,0,1,1,1,1,0};
        // System.out.println(Arrays.toString(arr));
        // int maxCount = 0;
        // int count = 0;
        // for (int index = 0; index < arr.length; index++) {
        // if (arr[index]==1) {
        // count ++;
        // if (maxCount<count) maxCount=count;
        // }
        // else {
        // count =0;
        // }
        // }
        // System.out.print(maxCount);

        // Вычислить [n-ое треугольного число](сумма чисел от 1 до n), n! (произведение
        // чисел от 1 до n)
        // System.out.print("введите число для расчета: ");
        // int var = iScanner.nextInt();
        // int result = funcSum(var);
        // System.out.println("Треугольное число = " + result);
        // long var1 = Long.valueOf(var);
        // long result1 = factor(var1);
        // System.out.print("Факториал числа = " + result1);
       
        // Вывести все простые числа от 1 до 1000

        // for (int index = 1; index <= 1000; index++) {
        //     int temp = 2;
        //     boolean flag = true;
        //     while (temp*temp <= index) { // ускоренная ф-ция проверки делимости
        //         if (index % temp == 0){
        //             flag = false;
        //             break;
        //         }
        //         temp++;
        //     }
        //     if (flag) {System.out.println(index);}
        // }
        //Реализовать простой калькулятор
        // boolean flag = true;
        // while (flag) {
        //     Scanner iScanner = new Scanner(System.in);
        //     System.out.print("введите выражение в формате число|+|-|*|/|число|=  : ");
        //     String inputString = iScanner.nextLine();
        //     String[] tempString = inputString.split("[+-//*///=]+");
        //     double arg1 = Integer.parseInt (tempString[0]);
        //     double arg2 = Integer.parseInt (tempString[1]);
        //     String mark = inputString.replaceAll("[1234567890=]", "");
        //     calculation(arg1, arg2, mark);
        //     System.out.print("продолжить вычисления (1-да, 2-нет) : ");
        //     if (iScanner.nextInt() == 2) {
        //         flag =false;
        //     };
            
        // }
        //Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса,
        //  например 2?+?5=69. Требуется восстановить выражение до верного равенства. 
        // Предложить хотя бы одно решение или сообщить, что его нет.
        Scanner iScanner = new Scanner(System.in);
        System.out.print("введите выражение q + w = e , при этом q,w,e любой разрядности и q,w могут содержать по одной пропущенной цифре, замененной на ? или даже q=? b w=?: ");
        String inputString = iScanner.nextLine();
        String[] tempString = inputString.split("[+//=]+");
        int result = Integer.parseInt(tempString[2]);
        convertAndCheck(tempString[0], tempString[1],result);

        iScanner.close();
    }
}
