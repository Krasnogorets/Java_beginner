import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;


public class HW2_task4 {
    static void calculation(double arg1, double arg2, String mark)throws IOException {
        double result;
        switch (mark) {
            case "+":
                result= arg1 + arg2;
                logging("ответ:" + result);
                System.out.printf("ответ: %s \n", arg1 + arg2);
                return;
            case "-":
                result= arg1 - arg2;
                logging("ответ:" + result);
                System.out.printf("ответ: %s \n", arg1 - arg2);
                return;
            case "*":
                result= arg1 * arg2;
                logging("ответ:" + result);
                System.out.printf("ответ: %s \n", arg1 * arg2);
                return;
            case "/":
                if(arg2==0){
                    logging("делить на 0 нельзя");
                    System.out.println("делить на 0 нельзя");
                }
                else{
                    result= arg1 / arg2;
                    logging("ответ:" + result);
                    System.out.printf("ответ: %s \n", arg1 / arg2);}
                return;
        }
    
    }
    static void logging(String str)throws IOException{
        Logger logger = Logger.getLogger(HW2_task4.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh = new FileHandler("logCalc.txt",1000, 1,true);

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(str);
        
      
        return;
    }
    public static void main(String[] args) throws IOException{
        // Реализовать простой калькулятор
        boolean flag = true;
        
        while (flag) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("введите выражение в формате число|+|-|*|/|число|= : ");
        logging("введите выражение в формате число|+|-|*|/|число|= :");
        String inputString = iScanner.nextLine();
        logging(inputString);
        String[] tempString = inputString.split("[+-//*///=]+");
        double arg1 = Integer.parseInt (tempString[0]);
        double arg2 = Integer.parseInt (tempString[1]);
        String mark = inputString.replaceAll("[1234567890=]", "");
        calculation(arg1, arg2, mark);
        System.out.print("продолжить вычисления (1-да, 2-нет) : ");
        logging("продолжить вычисления (1-да, 2-нет) : ");
        int inputString1 = iScanner.nextInt();
        if (inputString1 == 2) {
        flag =false;
        logging(Integer.toString(inputString1));
        iScanner.close();
        };
        
        }
        
}
}
