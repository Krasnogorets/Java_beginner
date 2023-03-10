import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    
    // static StringBuilder newString(int stringLen, String firstSymbol,String secondSymbol){
    //     StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < stringLen/2; i++) {
    //  sb.append(firstSymbol+secondSymbol);


    // }
    // return sb;

    // }
    public static StringBuilder task3 () {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
        sb.append("TEST");
        }
        return sb;
    }
    public static void main(String[] args) throws Exception {
        // Scanner iscan = new Scanner(System.in);
        // System.out.println("введите четное число - длину строки:");
        // int stringLen = iscan.nextInt();
        // if (stringLen%2 !=0 && stringLen>0){
        //     System.out.println("введите четное число");
        //     return;
        // }
        // System.out.println("введите первый символ:");
        // String firstSymbol = iscan.next();
       
        // System.out.println("введите второй символ:");
        // String secondSymbol = iscan.next();
        // if(firstSymbol.length() !=1 || secondSymbol.length()!=1){
        //     System.out.println("введите по одному символу , а не набор");
        //     return;
        // }
        // System.out.println(newString(stringLen,firstSymbol,secondSymbol));
        // iscan.close();

        // напишите метод сжимающий строку, на вход ааааbbbcdd на выходе a4b3c1d2
        // Scanner iscan1 = new Scanner(System.in);
        // System.out.println("введите строку:");
        // String string1 = iscan1.nextLine();
        // char[] chars1 = string1.toCharArray();

        // int count = 0;
        // char temp =  chars1[0];
        // String n ="";
        // StringBuilder newString = new StringBuilder();
        // for (char charI : chars1) {
            
        //     if (charI == temp){
        //         count++;
        //     }
            
        //     if (charI != temp){
        //         n =Integer.toString(count);
        //         newString.append(temp+n);
        //         count = 1;
        //         temp = charI;
        //     }
            
        // }
        // newString.append(temp+n);
        // System.out.println(newString);
        // iscan1.close();

        // напишите метод принимающий на вход строку и определят палиндром это или нет
        // Scanner iscan2 = new Scanner(System.in);
        // System.out.println("введите слово:");
        // String string2 = iscan2.nextLine();
        // String string3 = "а роза упала на лапу азора";
        // // if (string2.length()%2 == 0){
        // //     System.out.println("слово точно не палиндром, число букв должно быть нечетным");
        // //     return;
        // // }
        // String string2 =string3.replace(" ", "string3").toLowerCase();
        // char[] newchar = string2.toCharArray();
        // boolean flag = true;
        // int count2=string2.length()-1;
        // for (int index = 0; index < string2.length()%2; index++) {
        //     if (newchar[index] != newchar[count2]){
        //         flag = false;
        //         break;
        //     }
        //     count2--;

        // }
        // if (flag) {
        //     System.out.printf("слово " + string3 +" палиндром ");
        // }
        // else{
        //     System.out.printf("слово " + string3 +" НЕ палиндром ");
        // }
        // // iscan2.close();
        String singleString = task3().toString();
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write(singleString);
            fw.flush();
            } catch (IOException ex) {
                throw new IOException(ex.getMessage());
            
            }
        
    }
    
}
