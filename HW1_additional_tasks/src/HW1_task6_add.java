
import java.util.Scanner;

public class HW1_task6_add {

    static double pow (double a, double n) {

        if (n == 0)
            return 1;
        if (n % 2 == 1)
            return pow (a, n-1) * a;
        else {
            double b = pow (a, n/2);
            return b * b;
        }
    }
    public static void main(String[] args) {
        //реализовать функцию возведения числа А в степень B, где А, B натруальные
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("введите число а: ");
        int a = iScanner.nextInt();
        System.out.printf("введите число b: ");
        int b = iScanner.nextInt();
        double result=0;
        if (b<0){
            result = 1/pow(a,b*-1);
        }
        else{
            result = pow(a,b);
        }
        System.out.printf("результат: " + result);
        iScanner.close();

    }

    
}
