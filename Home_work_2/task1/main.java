// // В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package Home_work_2.task1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class main{

    public static void main(String[] args) throws IOException {
    String[] sheet =  readFile("C:/Users/User/Desktop/Java_lessons/Home_work_2/task1/text.txt").split(",");
    StringBuilder sb = new StringBuilder();
    sb.append("SELECT * FROM students WHERE name = ");
    sb.append(getWord(sheet, 0));
    sb.append(" AND country = ");
    sb.append(getWord(sheet, 1));
    sb.append(" AND city = ");
    sb.append(getWord(sheet, 1));
    System.out.println(sb);
    }

    public static String getWord (String list[], int numElement){
        String word = list[numElement].toString();
        return word.substring(word.indexOf(":") + 1, word.length());
    }



    public static String readFile (String fileName) throws IOException {
        BufferedReader reader = new BufferedReader( new FileReader (fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while( ( line = reader.readLine() ) != null ) {
            stringBuilder.append( line );
        }
        stringBuilder.deleteCharAt(0);
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();
        return stringBuilder.toString();
    }
}
