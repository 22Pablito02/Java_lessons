// // В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.

package Home_work_2.task3;

import java.io.BufferedReader;
import java.util.Arrays;
import java.io.FileReader;
import java.io.IOException;


public class sbPractice {

    public static void main(String[] args) throws IOException {
        String[] sheet =  readFile("C:/Users/User/Desktop/Java_lessons/Home_work_2/task3/text.txt").split("},");
        StringBuilder sb = new StringBuilder();
        System.out.println(Arrays.toString(sheet));
       
        String[] tempArr = {};
        for (int i = 0; i < sheet.length; i++){
            tempArr = sheet[i].split(",");
            sb.append("Студент ");
            sb.append(getWord(tempArr, 0));
            sb.append(" получил ");
            sb.append(getWord(tempArr, 1));
            sb.append(" по предмету ");
            sb.append(getWord(tempArr, 2));
            System.out.println(sb);
            sb.setLength(0);
        }


    }

    public static String getWord(String list[], int numWord) {
        StringBuilder StringBuilder = new StringBuilder (list[numWord].toString().substring(list[numWord].toString().indexOf(":") + 2, list[numWord].toString().length() - 1));
        int lol = StringBuilder.toString().indexOf('"');
        if (lol > 0){
            StringBuilder.deleteCharAt(lol);
        }
        return StringBuilder.toString();

        // String word = (list[numWord].toString().substring(list[numWord].toString().indexOf(":") + 2, list[numWord].toString().length() - 1));
        // word.deleteCharAt(5);
        // return word;
        
    }

    public static String readFile(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        String line = null;
        StringBuilder stringBuilder = new StringBuilder();
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        reader.close();
        return stringBuilder.toString();

    }
}
