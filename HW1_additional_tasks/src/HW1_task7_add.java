package programs;

import java.util.Scanner;

public class HW1_task7_add {
    static String findCommand(int a, int b, int c, int d) {
        String commandList = "";
        // System.out.printf("числа не требуют преобразования, a=b");
        // System.out.printf(" "+a+" "+b+" "+c+" "+d);
        if (a == b) {
            commandList = "числа не требуют преобразования";
            // System.out.printf("числа не требуют преобразования, a=b");
            return commandList;
        }
    
        if ((a - b) < d) {
            return commandList;
        }
        
        commandList = "в работе";
        return commandList;

    }

    public static void main(String[] args) {
        // получить на вход 4 числа a,b,c,d , есть две команды к1 - умножить на с, к2 -
        // прибавить d, написать программу
        // которая выдает набор команд, позволяющий a превратить в b, либо выдать что
        // ответа нет
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число а: ");
        int a = iScanner.nextInt();
        System.out.printf("введите число b: ");
        int b = iScanner.nextInt();
        System.out.printf("введите число c: ");
        int c = iScanner.nextInt();
        System.out.printf("введите число d: ");
        int d = iScanner.nextInt();
        String result = findCommand(a, b, c, d);
        System.out.printf("" + result);

        iScanner.close();
    }
}
