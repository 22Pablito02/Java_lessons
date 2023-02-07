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
    // StringBuilder sb = new StringBuilder("Студент");
    System.out.println(Arrays.toString(sheet));
    System.out.println(sheet[0]);
    for(int i = 0; i < sheet.toString().length(); i++){
        System.out.println(sheet[i]);
    }


    }

    public static String getWord(String list[], int numElement) {
        String word = list[numElement].toString();
        return word.substring(word.indexOf(":") + 1, word.length());
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
