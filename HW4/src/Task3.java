
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.*;
import java.io.IOException;

public class Task3 {
    static void calculation(double arg1, double arg2, String mark, Stack<Double> myStack)throws IOException {
        double result;
        switch (mark) {
            case "+":
                result= arg1 + arg2;
                myStack.add(result);
                logging("ответ:" + result);

                return;
            case "-":
                result= arg1 - arg2;
                myStack.add(result);
                logging("ответ:" + result);
   
                return;
            case "*":
                result= arg1 * arg2;
                myStack.add(result);
                logging("ответ:" + result);

                return;
            case "/":
                if(arg2==0){
                    logging("делить на 0 нельзя");
                    System.out.println("делить на 0 нельзя");
                    myStack.add(null);
                }
                else{
                    result= arg1 / arg2;
                    myStack.add(result);
                    logging("ответ:" + result);
                   }
                return;
        }
    
    }
    static void logging(String str)throws IOException{
        Logger logger = Logger.getLogger(Task3.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh = new FileHandler("HW4/logCalc.txt",1000, 1,true);

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.info(str);
        
      
        return;
    }
    static String actionHandler (String str, Stack<Double> myStack)throws IOException{
        String []tempString = str.split("[+-//*///=]+");
        String tempStringMark = str.replaceAll("[1234567890=]", " ");
        tempStringMark=tempStringMark.substring(1);
        String []markString=tempStringMark.split(" ");
 
        double arg1 = Double.parseDouble(tempString[0]);
        double arg2 = Double.parseDouble(tempString[1]);
        String mark = markString[0];
        calculation(arg1,arg2,mark,myStack);
        if (myStack.peek() == null){
            return null;
        }
        else if (tempString.length >2){

        
        int StackIndex=0;
        for (int index = 2; index < tempString.length; index++) {
            if (tempString[index]!=null){
                StackIndex = index-2;
                arg1 = myStack.get(StackIndex);
                arg2 = Double.parseDouble(tempString[index]);
                mark = markString[index-1];
                calculation(arg1,arg2,mark,myStack);
            }
            else {
                return str;
                }
            }
        }
        else {
            System.out.printf("ответ: %s",myStack.peek());
            System.out.println("");
            return tempStringMark;
        }
        System.out.printf("ответ: %s",myStack.peek());
        System.out.println("");
       

        return str;

    }
    static String deleteLastAction(Stack<Double> myStack)throws IOException{
        myStack.pop();
        if (!myStack.isEmpty()){
        System.out.printf("ответ: %s",myStack.peek());
        System.out.println("");
        logging("ответ: "+ myStack.peek());
        }
        else {
            System.out.println("Последнее действие - единственное, его нельзя удалить");
        }
        return "";
    }
    public static void main(String[] args) throws IOException{
        // В калькулятор добавьте возможность отменить последнюю операцию 
        boolean flag = true;
        
        while (flag) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("введите выражение в формате число|+|-|*|/|число|, можно вводить сразу несколько действий ");
        System.out.print("например, 5+6-8*9/5, все действия будут выполнены по порядку: ");
        logging("введите выражение в формате число|+|-|*|/|число|= :");
        String inputString = iScanner.nextLine();
        if (inputString.length() <3){
            System.out.println("вы ввели мало данных ");
            continue;
        }
        else{
        logging(inputString);
        Stack<Double> myStack = new Stack<Double>();
        actionHandler(inputString,myStack);

        System.out.print("продолжить вычисления (1-да, 2-нет, 3 - отменить последнее действие) : ");
        logging("продолжить вычисления (1-да, 2-нет, 3 - отменить последнее действие) : ");
        int inputString1 = iScanner.nextInt();
        if (inputString1 == 2) {
        flag =false;
        logging(Integer.toString(inputString1));
        iScanner.close();
        }
        else if (inputString1 == 3) {
            deleteLastAction(myStack);
 
            };
        }
        
        }
        
    }
}
