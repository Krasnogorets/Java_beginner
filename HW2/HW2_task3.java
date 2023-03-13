import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.InputStream;


public class HW2_task3 {
    static void getMarkFromJson(){
        
        String resourceName = "file.json";
        InputStream is = HW2_task3.class.getResourceAsStream(resourceName);
        if (is == null) {
            throw new NullPointerException("Не найден файл " + resourceName);
        }

        JSONTokener tokener = new JSONTokener(is);
        JSONArray myArr = new JSONArray(tokener);
        for(int n = 0; n < myArr.length(); n++){
            JSONObject objects = myArr.getJSONObject(n);
            String soName = (String) objects.get("фамилия");
            String lession = (String) objects.get("предмет");
            String mark = (String) objects.get("оценка");
            StringBuilder sb = new StringBuilder();
            sb.append("Студент "+ soName + " получил " + mark+  " по предмету " + lession);
            System.out.println(sb);
         
        }
  

    }
    public static void main(String[] args) {
        //Дана json строка (можно сохранить в файл и читать из файла)
        //[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
        //{"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
        //{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
        // Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки вида:
        //  Студент [фамилия] получил [оценка] по предмету [предмет].Пример вывода:
        // Студент Иванов получил 5 по предмету Математика.
        // Студент Петрова получил 4 по предмету Информатика.
        // Студент Краснов получил 5 по предмету Физика.
        getMarkFromJson();

    }
}
