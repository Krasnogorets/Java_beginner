package seminar1;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        // System.out.println("Hello");
        // LocalDateTime newtime = LocalDateTime.now();
        // System.out.println(newtime);
        // System.out.println(LocalDateTime.now().getYear());
        // System.out.println(newtime.withMinute(0));

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("твое имя , чувак: ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);
        iScanner.close();
    }
}
