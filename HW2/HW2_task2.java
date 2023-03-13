
import java.util.Arrays;
import java.util.Random;
import java.util.logging.*;
import java.io.IOException;





public class HW2_task2 {
    static int[] sortArray(int [] arr)throws IOException{
        int temp;
        Logger logger = Logger.getLogger(HW2_task2.class.getName());
        logger.setUseParentHandlers(false);
        FileHandler fh = new FileHandler("log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        for (int index = 0; index < arr.length-1; index++) {
            for (int index1 = index+1; index1 < arr.length; index1++) {
                if(arr[index1] < arr[index]){
                    temp=arr[index];
                    arr[index] = arr[index1];
                    arr[index1] = temp;
                }
                logger.info(Arrays.toString(arr));
            }
        }

        return arr;
    }
    
    public static void main(String[] args) throws IOException{
        //Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
        int [] myArray = new int[20];
        for (int index = 0; index < myArray.length; index++) {
            myArray[index]= new Random().nextInt(1,40);
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(sortArray(myArray)));

    }
}
