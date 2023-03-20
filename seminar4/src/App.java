import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> ll = new LinkedList<String>();
        Scanner newScan = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println(ll);
        
        System.out.printf("введите команду: ");
        String str = newScan.nextLine();
   
        if (str.contains("print")){
            try {
                String []str1 = str.split("`");
   
                int num = Integer.parseInt(str1[1]);
                System.out.println(ll.get(num));
                ll.remove(num);
                flag = false;
            } catch (Exception e) {
                System.out.println("такого элемента нет");
            }

        }
        else {
            String []str1 = str.split("`");

            String text = str1[0];
            int num = Integer.parseInt(str1[1]);
            if (num > ll.size()){
                for (int index = 0 ; index < num; index++) {
                    ll.add(index, null);
                }
            }
            ll.add(num, text);
        }
        
        }


        newScan.close();
    }
}
