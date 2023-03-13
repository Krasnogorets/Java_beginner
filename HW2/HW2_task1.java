
import java.util.HashMap;

public class HW2_task1 {
   
    static StringBuilder newQuerry(String str, HashMap data){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if(data.get("name") != null){
            sb.append(" name='"+ data.get("name")+"'");
        }
        if(data.get("country") != null){
            sb.append(" country='"+ data.get("country")+"'");
        }
        if(data.get("city") != null){
            sb.append(" city='"+ data.get("city")+"'");
        }
        if(data.get("age") != null){
            sb.append(" age='"+ data.get("age")+"'");
        }
        return sb;
    }
    public static void main(String[] args) {
        //Дана строка sql-запроса "select * from students where ". 
        // Сформируйте часть WHERE этого запроса, используя StringBuilder. 
        // Данные для фильтрации приведены ниже в виде json строки.
        // Если значение null, то параметр не должен попадать в запрос.
        // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        String querry = "select * from students where ";
               HashMap<String, String> data = new HashMap<>(); // формируем аналог json строки
        data.put("name", "Ivanov");
        data.put("country", "Russia");
        data.put("city", "Moscow");
        data.put("age", null);
        System.out.println(newQuerry(querry,data));
        
        
        
    }
}
